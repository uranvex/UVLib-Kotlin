package uv.uranvex.uvlib.utils

import net.md_5.bungee.api.ChatColor
import java.util.List
import java.util.regex.MatchResult
import java.util.regex.Pattern

object HexUtil {
    private val HEX_COLOR_PATTERN: Pattern = Pattern.compile("#[a-fA-F0-9]{6}")

    @JvmStatic
    fun color(value: String): String {
        return ChatColor.translateAlternateColorCodes('&', HEX_COLOR_PATTERN
            .matcher(value)
            .replaceAll { match: MatchResult ->
                List.of(match.group()).toString()
            })
    }
}
