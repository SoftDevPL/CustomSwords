package org.main.customswords;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.main.customswords.json.Json;

import java.util.logging.Level;

public final class CustomSwords extends JavaPlugin {

    @Override
    public void onEnable() {
        try {
            ItemStack itemStack = new ItemStack(Material.DIAMOND_SWORD);
            JsonNode node = Json.toJson(itemStack.serialize());
            this.getLogger().log(Level.INFO, Json.prettyPrint(node));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
