/* VorbisComment - Decompiled by JODE
 * 
 */
package jagtheora.vorbis;
import jagtheora.misc.SimplePeer;

public class VorbisComment extends SimplePeer
{
	private final native void init();
	
	public VorbisComment() {
		init();
		if (this.b()) {
			throw new IllegalStateException();
		}
	}
	
	protected final native void clear();
}
