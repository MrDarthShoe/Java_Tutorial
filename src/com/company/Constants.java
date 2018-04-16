package com.company;

public class Constants {
    public static int WINDOW_HEIGHT = 600;
    public static int WINDOW_WIDTH = 800;
    public static int FRAMES_PER_SECOND = 60;
    public static int SKIP_TICKS = 1000 / FRAMES_PER_SECOND;
    public static int TILE_SIZE = 16;
    public static int MAP_WIDTH = WINDOW_WIDTH - WINDOW_WIDTH % TILE_SIZE;
    public static int MAP_HEIGHT = WINDOW_HEIGHT - WINDOW_HEIGHT % TILE_SIZE;
}
