package com.example.arturo.cartoonifier;

/**
 * Created by arturo on 20/01/16.
 */
public class NativeCartoon {
    public native static boolean processImage(int width, int height,
                                       byte[] NV21FrameData, int[] pixels);
}
