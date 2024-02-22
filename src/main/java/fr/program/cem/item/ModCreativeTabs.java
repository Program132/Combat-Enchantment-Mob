package fr.program.cem.item;

import fr.program.cem.TutoMod;
import fr.program.cem.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CreativeTabs =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutoMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        CreativeTabs.register(eventBus);
    }

    public static final RegistryObject<CreativeModeTab> TUTO_TAB = CreativeTabs.register("cem_tab", // Create a custom tab in creative menu
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Items.ENCHANTED_BOOK))
                    .title(Component.translatable("creativetab.cem_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        // Accepting items from the mod
                        pOutput.accept(ModItems.SHARPNESS_ZOMB.get());
                        pOutput.accept(ModItems.KNOCKBACK_ZOMB.get());
                        pOutput.accept(ModItems.PROTECTION_ZOMB.get());

                        // Accepting blocks from the mod
                        pOutput.accept(ModBlocks.ZOMB_DIRT.get());
                        pOutput.accept(ModBlocks.SKEL_DIRT.get());
                        pOutput.accept(ModBlocks.BLAZE_DIRT.get());
                    })
                    .build()); // Set icon of the tab to Sapphire
}