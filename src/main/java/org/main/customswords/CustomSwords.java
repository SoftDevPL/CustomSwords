package org.main.customswords;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import org.bukkit.plugin.java.JavaPlugin;
import org.main.customswords.json.Json;

import java.util.logging.Level;

public final class CustomSwords extends JavaPlugin {

    @Override
    public void onEnable() {
        String source = "{ \"elo\": \"elo\" }";
        try {
            JsonNode node = Json.parse(source);

            this.getLogger().log(Level.INFO, node.get("elo").asText());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
