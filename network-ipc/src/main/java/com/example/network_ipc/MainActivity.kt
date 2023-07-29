package com.example.network_ipc

import android.net.ConnectivityManager
import android.net.LinkProperties
import android.net.Network
import android.net.NetworkCapabilities
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val n = getSystemService(ConnectivityManager::class.java)

        val activeNetworkInfo = n.activeNetworkInfo!!

        n.requestNetwork()

        n.register


        n.registerDefaultNetworkCallback(object : ConnectivityManager.NetworkCallback() {
            override fun onAvailable(network: Network) {
                super.onAvailable(network)
            }

            override fun onLosing(network: Network, maxMsToLive: Int) {
                super.onLosing(network, maxMsToLive)
            }

            override fun onLost(network: Network) {
                super.onLost(network)
            }

            override fun onUnavailable() {
                super.onUnavailable()
            }

//            @RequiresApi(Build.VERSION_CODES.Q)
            override fun onCapabilitiesChanged(
                network: Network,
                networkCapabilities: NetworkCapabilities
            ) {
//                val transportInfo = networkCapabilities.transportInfo!!
                networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)
                super.onCapabilitiesChanged(network, networkCapabilities)
            }

            override fun onLinkPropertiesChanged(network: Network, linkProperties: LinkProperties) {

                super.onLinkPropertiesChanged(network, linkProperties)
            }

            override fun onBlockedStatusChanged(network: Network, blocked: Boolean) {
                super.onBlockedStatusChanged(network, blocked)
            }
        })
    }
}