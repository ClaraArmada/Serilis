package com.github.ClaraArmada.serilis.init;

import com.github.ClaraArmada.serilis.Serilis;
import com.github.ClaraArmada.serilis.world.items.*;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.LeadItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Serilis.MODID);

    public static final RegistryObject<Item> RAW_CHALCOPYRITE = ITEMS.register("raw_chalcopyrite",
            () -> new metaltooltip(new Item.Properties()));
    public static final RegistryObject<Item> FLINT_FLAKE = ITEMS.register("flint_flake",
            () -> new AxeItem(ItemTiers.FLINT, 0, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> FLINT_KNIFE_HEAD = ITEMS.register("flint_knife_head",
            () -> new FlintKnife(ItemTiers.FLINT, 1, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> FLINT_KNIFE = ITEMS.register("flint_knife",
            () -> new FlintKnife(ItemTiers.FLINT, 3, -2.5F, new Item.Properties()));
    public static final RegistryObject<Item> FLINT_AXE_HEAD = ITEMS.register("flint_axe_head",
            () -> new AxeItem(ItemTiers.FLINT, 1.0F, -3.5F, new Item.Properties()));
    public static final RegistryObject<Item> FLINT_AXE = ITEMS.register("flint_axe",
            () -> new AxeItem(ItemTiers.FLINT, 1.0F, -3.5F, new Item.Properties()));
    public static final RegistryObject<Item> FLINT_ARROWHEAD = ITEMS.register("flint_arrowhead",
            () -> new FlintKnife(ItemTiers.FLINT, 0, -2.5F, new Item.Properties()));
    public static final RegistryObject<Item> FLINT_SPEAR = ITEMS.register("flint_spear",
            () -> new SpearItem((new Item.Properties()).durability(65)));
    public static final RegistryObject<Item> OAK_BOARD = ITEMS.register("oak_board",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BOARD = ITEMS.register("spruce_board",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_BOARD = ITEMS.register("birch_board",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BOARD = ITEMS.register("jungle_board",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BOARD = ITEMS.register("acacia_board",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DARK_BOARD = ITEMS.register("dark_oak_board",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_BOARD = ITEMS.register("mangrove_board",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_BOARD = ITEMS.register("crimson_board",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BOARD = ITEMS.register("warped_board",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLANT_FIBER = ITEMS.register("plant_fiber",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TWINE = ITEMS.register("twine",
            () -> new LeadItem(new Item.Properties()));
    public static final RegistryObject<Item> BRANCH = ITEMS.register("branch",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DAUB = ITEMS.register("daub",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ANIMAL_EXCREMENTS = ITEMS.register("animal_excrements",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MUD_PILE = ITEMS.register("mud_pile",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMALL_FUR = ITEMS.register("small_fur",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PRIMITIVE_COAT = ITEMS.register("primitive_coat",
            () -> new ArmorItem(ModArmorMaterials.PRIMITIVE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> PRIMITIVE_BOOTS = ITEMS.register("primitive_boots",
            () -> new ArmorItem(ModArmorMaterials.PRIMITIVE, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> PRIMITIVE_LEGGINGS = ITEMS.register("primitive_leggings",
            () -> new ArmorItem(ModArmorMaterials.PRIMITIVE, ArmorItem.Type.LEGGINGS, new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
