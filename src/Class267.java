/* Class267 - Decompiled by JODE
 * 
 */

public class Class267
{
	protected boolean aBoolean3442 = true;
	protected int anInt3443;
	private char aChar3444;
	static OutgoingPacket walkingPacket = new OutgoingPacket(12, 5);
	static int anInt3446;
	static int anInt3447;
	static int anInt3448; 
	static Class266 aClass266_3449;
	protected String aString3450;
	
	public static void method3286(byte b) {
		if (b == -20) {
			walkingPacket = null;
			aClass266_3449 = null;
		}
	}
	
	final boolean method3287(byte b) {
		anInt3448++;
		@SuppressWarnings("unused")
		int i = 83 / ((38 - b) / 60);
		if ((aChar3444 ^ 0xffffffff) != -116) {
			return false;
		}
		return true;
	}
	
	final void method3288(Buffer buffer, byte b) {
		for (;;) {
			int i = buffer.readUnsignedByte();
			if ((i ^ 0xffffffff) == -1) {
				break;
			}
			method3289(b ^ 0x21, i, buffer);
		}
		if (b == 87) {
			anInt3446++;
		}
	}
	
	private final void method3289(int i, int i_0_, Buffer buffer) {
		if (i <= 92) {
			aChar3444 = '0';
		}
		if (i_0_ != 1) {
			if ((i_0_ ^ 0xffffffff) == -3) {
				anInt3443 = buffer.readInt();
			} else if ((i_0_ ^ 0xffffffff) == -5) {
				aBoolean3442 = false;
			} else if (i_0_ == 5) {
				aString3450 = buffer.readString();
			}
		} else {
			aChar3444 = Class20_Sub1.method294(buffer.readByte(), (byte) 124);
		}
		anInt3447++;
	}
}
