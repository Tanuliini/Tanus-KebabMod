package tanu.kebab;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tanu.kebab.item.ModItems;

public class TanusKebabMod implements ModInitializer {
	public static final String MOD_ID = "kebab-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
	}
}