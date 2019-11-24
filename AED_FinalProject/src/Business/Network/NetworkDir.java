/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import java.util.ArrayList;

/**
 *
 * @author koppu
 */
public class NetworkDir {
    private ArrayList<Network> networkDir;

    public NetworkDir() {
        networkDir = new ArrayList<Network>();;
    }

    public ArrayList<Network> getNetworkDir() {
        return networkDir;
    }

    public void setNetworkDir(ArrayList<Network> networkDir) {
        this.networkDir = networkDir;
    }
    public Network addNetwork(){
        Network newNetwork = new Network();
        networkDir.add(newNetwork);
        return newNetwork;
    }
   
    public void deleteNetwork(Network network){
        networkDir.remove(network);
    }
   
   
}
