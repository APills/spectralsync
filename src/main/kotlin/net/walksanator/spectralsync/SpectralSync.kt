package net.walksanator.spectralsync

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.core.Registry
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Rarity
import org.slf4j.LoggerFactory

object SpectralSync : ModInitializer {
    private val logger = LoggerFactory.getLogger("spectral-sync")
    val SYNC_BOOK = SyncBook(FabricItemSettings().maxCount(1).rarity(Rarity.UNCOMMON).stacksTo(1))

    override fun onInitialize() {
        // Log initialization message
        logger.info("Hello Fabric world!")

        // Use Registry.ITEM for 1.19.2 compatibility
        Registry.register(Registry.ITEM, ResourceLocation("spectral-sync", "syncbook"), SYNC_BOOK)
    }
}
