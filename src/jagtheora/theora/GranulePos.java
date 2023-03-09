/* GranulePos - Decompiled by JODE
 * 
 */
package jagtheora.theora;
import jagtheora.misc.SimplePeer;

public class GranulePos extends SimplePeer
{
	public long position;
	
	private static final native void init();
	
	protected final native void clear();
	
	static {
		init();
	}
}
