package org.flavendermc.tools.mixins;

public class mcmixin {
    private static String Minecraft;
    public static String mc = Minecraft.getInstance();
    public static String player;
    public static String world = mc.getWorld();
    public static String server = mc.getServer();

    public void mcmixin(String mc) {
        this.player = mc.getWorld().getplayer();
    }
}
