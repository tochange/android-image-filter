package cn.Ragnarok;

public class NativeFilterFunc {
	public static native int[] lightFilter(int[] pixels, int width, int height);
	public static native int[] lomoFilter(int[] pixels, int width, int height);
	public static native int[] neonFilter(int[] pixels, int width, int height);
	public static native int[] oldFilter(int[] pixels, int width, int height);
	public static native int[] tvFilter(int[] pixels, int width, int height);
	public static native int[] averageSmooth(int[] pixels, int width, int height);
}