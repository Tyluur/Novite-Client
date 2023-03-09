/* User32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.ms.win32;

import com.ms.dll.Callback;

public class User32 {
	public static native int SetWindowLong(int i, int i_0_, int i_1_);

	public static native int GetWindowLong(int i, int i_2_);

	public static native int CallWindowProc(Callback callback, int i, int i_3_,
			int i_4_, int i_5_);

	public static native int SetCursor(int i);

	public static int SetWindowLong(int i, int i_6_, Callback callback) {
		return 0;
	}

	public static native boolean SetCursorPos(int i, int i_7_);

	public static native int LoadCursor(int i, int i_8_);

	public static native int SendMessage(int i, int i_9_, int i_10_,
			Object object);

	public static int CallWindowProc(int i, int i_11_, int i_12_, int i_13_,
			int i_14_) {
		return 0;
	}

	public static int SetWindowLong(int i, int i_15_, Object object) {
		return 0;
	}
}
