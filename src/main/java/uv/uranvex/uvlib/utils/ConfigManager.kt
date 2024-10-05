package uv.uranvex.uvlib.utils

import lombok.Getter
import org.bukkit.configuration.file.YamlConfiguration
import uv.uranvex.uvlib.UVLib
import java.io.File

class ConfigManager {
    private val configs: MutableMap<String, YamlConfiguration> = HashMap()

    fun init(vararg fileNames: String) {
        for (fileName in fileNames) {
            var fileName = fileName
            fileName = "$fileName.yml"

            val file = File(UVLib.instance!!.dataFolder.absolutePath + "/" + fileName)

            if (!file.exists()) {
                UVLib.instance!!.saveResource(fileName, false)
            }

            configs[fileName] = YamlConfiguration.loadConfiguration(file)
        }
    }

    fun get(configName: String): YamlConfiguration? {
        return configs["$configName.yml"]
    }

    companion object {
        @Getter
        val instance: ConfigManager = ConfigManager()
    }
}

