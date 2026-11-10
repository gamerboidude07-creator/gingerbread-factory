package com.example.gingerbreadfactory;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GingerbreadMod.MODID);
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(GingerbreadMod.MODID);
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GingerbreadMod.MODID);

    // Stage 1-2: ingredients
    public static final DeferredItem<Item> SPICE = ITEMS.registerSimpleItem("gingerbread_spice");
    public static final DeferredItem<Item> DOUGH = ITEMS.registerSimpleItem("gingerbread_dough");
    // Stage 3: raw (not edible, must be baked)
    public static final DeferredItem<Item> RAW_MAN = ITEMS.registerSimpleItem("raw_gingerbread_man");
    // Stage 4: baked
    public static final DeferredItem<Item> MAN = ITEMS.registerSimpleItem("gingerbread_man",
            new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationModifier(0.5f).build()));
    // Stage 5: icing
    public static final DeferredItem<Item> ICING = ITEMS.registerSimpleItem("royal_icing");
    // Stage 6: frosted
    public static final DeferredItem<Item> FROSTED_MAN = ITEMS.registerSimpleItem("frosted_gingerbread_man",
            new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationModifier(0.8f).build()));

    // Stage 7: the prize block
    public static final DeferredBlock<Block> HOUSE = BLOCKS.registerSimpleBlock("gingerbread_house",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(1.5f).sound(SoundType.WOOD));
    public static final DeferredItem<BlockItem> HOUSE_ITEM = ITEMS.register("gingerbread_house",
            () -> new BlockItem(HOUSE.get(), new Item.Properties()));

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TAB = TABS.register("main",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + GingerbreadMod.MODID))
                    .icon(() -> new ItemStack(FROSTED_MAN.get()))
                    .displayItems((params, output) -> {
                        output.accept(SPICE.get());
                        output.accept(DOUGH.get());
                        output.accept(RAW_MAN.get());
                        output.accept(MAN.get());
                        output.accept(ICING.get());
                        output.accept(FROSTED_MAN.get());
                        output.accept(HOUSE_ITEM.get());
                    })
                    .build());
}
