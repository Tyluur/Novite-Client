/* IUnknownReference - Decompiled by JODE
 * 
 */
package jaclib.peer;

class IUnknownReference extends PeerReference
{
	IUnknownReference(IUnknown iunknown, ti var_ti) {
		super((Peer) iunknown, var_ti);
	}
	
	protected final native long releasePeer(long l);
}
