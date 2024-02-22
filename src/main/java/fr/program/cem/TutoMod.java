package fr.program.cem;

import com.mojang.logging.LogUtils;
import fr.program.cem.block.ModBlocks;
import fr.program.cem.item.ModCreativeTabs;
import fr.program.cem.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(TutoMod.MOD_ID)
public class TutoMod
{
    public static final String MOD_ID = "cem";
    private static final Logger LOGGER = LogUtils.getLogger();

    public TutoMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus); // Register for items from this mod
        ModCreativeTabs.register(modEventBus); // Register for custom tabs
        ModBlocks.register(modEventBus); // Register for blocks from this mod

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)  {

    }
    private void addCreative(BuildCreativeModeTabContentsEvent event)  {
        /*
        Add items to creative tab
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.RAW_SAPPHIRE); // Add Raw Sapphire item to ingredients tab
            event.accept(ModItems.SAPPHIRE);
        }
        */
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)  {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents  {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
