package fr.program.cem.block.custom;

import fr.program.cem.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class Controller extends Block {
    public Controller(Properties p) {
        super(p);
    }

    // Right click event :
    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        ItemStack item = pPlayer.getItemInHand(pHand);

        ItemStack enchanted = new ItemStack(Items.ENCHANTED_BOOK, 1);

        if (item.is(ModItems.SHARPNESS_ZOMB.get())) {
            item.shrink(1);
            EnchantedBookItem.addEnchantment(enchanted, new EnchantmentInstance(Enchantments.SHARPNESS, 1));
            pPlayer.getInventory().add(enchanted);
        } else if (item.is(ModItems.KNOCKBACK_ZOMB.get())) {
            item.shrink(1);
            EnchantedBookItem.addEnchantment(enchanted, new EnchantmentInstance(Enchantments.KNOCKBACK, 1));
            pPlayer.getInventory().add(enchanted);
        } else if (item.is(ModItems.PROTECTION_ZOMB.get())) {
            item.shrink(1);
            EnchantedBookItem.addEnchantment(enchanted, new EnchantmentInstance(Enchantments.ALL_DAMAGE_PROTECTION, 1));
            pPlayer.getInventory().add(enchanted);
        } else if (item.is(ModItems.POWER_SKEL.get())) {
            item.shrink(1);
            EnchantedBookItem.addEnchantment(enchanted, new EnchantmentInstance(Enchantments.POWER_ARROWS, 1));
            pPlayer.getInventory().add(enchanted);
        } else if (item.is(ModItems.UNBREAKING_SKEL.get())) {
            item.shrink(1);
            EnchantedBookItem.addEnchantment(enchanted, new EnchantmentInstance(Enchantments.UNBREAKING, 1));
            pPlayer.getInventory().add(enchanted);
        } else if (item.is(ModItems.LOOTING_SKEL.get())) {
            item.shrink(1);
            EnchantedBookItem.addEnchantment(enchanted, new EnchantmentInstance(Enchantments.MOB_LOOTING, 1));
            pPlayer.getInventory().add(enchanted);
        } else if (item.is(ModItems.FLAME_BLAZE.get())) {
            item.shrink(1);
            EnchantedBookItem.addEnchantment(enchanted, new EnchantmentInstance(Enchantments.FLAMING_ARROWS, 1));
            pPlayer.getInventory().add(enchanted);
        } else if (item.is(ModItems.FIRE_ASPECT_BLAZE.get())) {
            item.shrink(1);
            EnchantedBookItem.addEnchantment(enchanted, new EnchantmentInstance(Enchantments.FIRE_ASPECT, 1));
            pPlayer.getInventory().add(enchanted);
        } else if (item.is(ModItems.FIRE_PROTECTION_BLAZE.get())) {
            item.shrink(1);
            EnchantedBookItem.addEnchantment(enchanted, new EnchantmentInstance(Enchantments.FIRE_PROTECTION, 1));
            pPlayer.getInventory().add(enchanted);
        } else {
            enchanted.shrink(1);
        }
        return InteractionResult.SUCCESS;
    }
}
