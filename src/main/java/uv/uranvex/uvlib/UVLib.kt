package uv.uranvex.uvlib

import org.bukkit.plugin.java.JavaPlugin

class UVLib : JavaPlugin() {
    override fun onEnable() {
        instance = this
        logger.info("UVLib by uranvex [ON]")
    }

    companion object {
        @kotlin.jvm.JvmField
        var instance: UVLib? = null
    }
}
