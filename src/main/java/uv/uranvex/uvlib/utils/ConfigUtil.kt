package uv.uranvex.uvlib.utils

import uv.uranvex.uvlib.UVLib
import uv.uranvex.uvlib.utils.HexUtil.color

object ConfigUtil {
    fun getString(path: String): String {
        return color(UVLib.instance!!.config.getString(path)!!)
    }

    fun getInt(path: String): Int {
        return UVLib.instance!!.config.getInt(path)
    }

    fun getBoolean(path: String): Boolean {
        return UVLib.instance!!.config.getBoolean(path)
    }
}
