/* NativeHeapPeerReference - Decompiled by JODE
 * 
 */
package jaclib.peer;

class NativeHeapPeerReference extends PeerReference
{
	protected final native long releasePeer(long l);
	
	NativeHeapPeerReference(os var_os, ti var_ti) {
		super((Peer) var_os, var_ti);
	}
}
