/* CacheNode_Sub16 - Decompiled by JODE
 * 
 */
import java.applet.Applet;

abstract class CacheNode_Sub16 extends CacheNode
{
	protected boolean aBoolean9597;
	protected boolean aBoolean9598;
	static OutgoingPacket aClass318_9599 = new OutgoingPacket(24, 7);
	static Class312 aClass312_9600 = new Class312();
	static Applet anApplet9601;
	volatile boolean aBoolean9602 = true;
	
	public static void method2384(byte b) {
		anApplet9601 = null;
		aClass318_9599 = null;
		if (b == 63) {
			aClass312_9600 = null;
		}
	}
	
	abstract byte[] method2385(int i);
	
	abstract int method2386(byte b);
	
	public CacheNode_Sub16() {
		/* empty */
	}
}
