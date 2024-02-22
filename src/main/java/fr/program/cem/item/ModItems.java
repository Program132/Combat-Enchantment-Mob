package fr.program.cem.item;

import fr.program.cem.TutoMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutoMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    // Items
    public static final RegistryObject<Item> SHARPNESS_ZOMB = ITEMS.register("sharpness_zomb",
            () -> new Item(
                    new Item.Properties()
            ));

    public static final RegistryObject<Item> KNOCKBACK_ZOMB = ITEMS.register("knockback_zomb",
            () -> new Item(
                    new Item.Properties()
            ));

    public static final RegistryObject<Item> PROTECTION_ZOMB = ITEMS.register("protection_zomb",
            () -> new Item(
                    new Item.Properties()
            ));


    public static final RegistryObject<Item> UNBREAKING_SKEL = ITEMS.register("unbreaking_skel",
            () -> new Item(
                    new Item.Properties()
            ));

    public static final RegistryObject<Item> LOOTING_SKEL = ITEMS.register("looting_skel",
            () -> new Item(
                    new Item.Properties()
            ));

    public static final RegistryObject<Item> POWER_SKEL = ITEMS.register("power_skel",
            () -> new Item(
                    new Item.Properties()
            ));


    public static final RegistryObject<Item> FIRE_PROTECTION_BLAZE = ITEMS.register("fire_protection_blaze",
            () -> new Item(
                    new Item.Properties()
            ));

    public static final RegistryObject<Item> FIRE_ASPECT_BLAZE = ITEMS.register("fire_aspect_blaze",
            () -> new Item(
                    new Item.Properties()
            ));

    public static final RegistryObject<Item> FLAME_BLAZE = ITEMS.register("flame_blaze",
            () -> new Item(
                    new Item.Properties()
            ));
}
