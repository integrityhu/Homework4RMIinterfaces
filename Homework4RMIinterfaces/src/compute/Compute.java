/**
 * 
 */
package compute;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author pzoli
 *
 */
public interface Compute extends Remote {
    <T> T executeTask(Task<T> t) throws RemoteException;
}
