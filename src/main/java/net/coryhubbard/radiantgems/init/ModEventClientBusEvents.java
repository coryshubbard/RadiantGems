package net.coryhubbard.radiantgems.init;

import net.coryhubbard.radiantgems.RadiantgemsMod;
import net.coryhubbard.radiantgems.init.RadiantgemsModBlockEntities;
import net.coryhubbard.radiantgems.block.entity.client.GeodeSmasherRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;
import software.bernie.example.GeckoLibMod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

import javax.annotation.Nonnull;
import org.checkerframework.checker.units.qual.radians;

@Mod.EventBusSubscriber(modid = "radiantgems", bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(RadiantgemsModBlockEntities.GEODE_SMASHER.get(), GeodeSmasherRenderer::new);
    }
}