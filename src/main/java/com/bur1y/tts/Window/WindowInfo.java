package com.bur1y.tts.Window;

import com.bur1y.tts.Check.Regex;
import com.sun.jna.platform.DesktopWindow;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.win32.StdCallLibrary;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static com.sun.jna.platform.WindowUtils.*;

public class WindowInfo {

    public interface User32 extends StdCallLibrary {
        WinDef.HWND hwnd = com.sun.jna.platform.win32.User32.INSTANCE.GetForegroundWindow();
    }

    public static List<WindowApp> windowAppList = new ArrayList<>();


    /**
     * @return Active window name
     */
    public static String getWindowTittle(WinDef.HWND hwnd) {
        return getWindowTitle(hwnd);
    }

    /**
     * @return Path of the executable file of the active window
     */
    public static String getWindowPFP(WinDef.HWND hwnd) {
        return getProcessFilePath(hwnd);
    }

    protected static List<DesktopWindow> getListWindows() {
        return getAllWindows(true);
    }

    public static void getLaunchedApps() {
        windowAppList.clear();
        for (DesktopWindow dw : getListWindows()) {
            WindowApp wApp = new WindowApp(Regex.getWindowPathName(dw.getHWND()), Regex.getWindowTitleName(dw.getHWND()), "Background");
            if (wApp.getAdditionalInfo() != null || !(wApp.getName().equals("explorer"))) {
                windowAppList.add(wApp);
                try {
                    saveIcon(dw);
                } catch (Exception e) {
                    System.out.println(e);
                    System.out.println("Неудалось сохранить картинку для " + Regex.getWindowPathName(dw.getHWND()));
                }
            }
        }
    }

    public static void setActiveWindow() {
        for (WindowApp windowApp : windowAppList) {
            if (windowApp.getName().equals(Regex.getWindowPathName(com.sun.jna.platform.win32.User32.INSTANCE.GetForegroundWindow()))) {
                windowApp.setCondition("Active");
            } else {
                windowApp.setCondition("Background");
            }
        }
    }

    private static void saveIcon(DesktopWindow dw) throws IOException {

        File targetFile = new File(getWindowPFP(dw.getHWND()));
        // Get metadata and create an icon
        sun.awt.shell.ShellFolder sf =
                sun.awt.shell.ShellFolder.getShellFolder(targetFile);
        ImageIcon icon = new ImageIcon(sf.getIcon(true));

        BufferedImage bi = new BufferedImage(
                icon.getIconWidth(),
                icon.getIconHeight(),
                BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.createGraphics();
        icon.paintIcon(null, g, 0,0);
        g.dispose();

        File outputfile = new File("src/main/java/Resources/icons/" + Regex.getWindowPathName(dw.getHWND()) + ".png");
        ImageIO.write(bi, "png", outputfile);


    }
}