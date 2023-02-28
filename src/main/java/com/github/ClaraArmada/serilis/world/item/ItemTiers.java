package com.github.ClaraArmada.serilis.world.item;

import java.util.function.Supplier;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum ItemTiers implements Tier {
    FLINT(0, 12, 0.2F, 0.0F, 0, () -> {
        return Ingredient.of(Items.FLINT);
    });

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private ItemTiers(int level, int uses, float speed, float damagebonus, int enchantmentval, Supplier<Ingredient> itemrepair) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damagebonus;
        this.enchantmentValue = enchantmentval;
        this.repairIngredient = new LazyLoadedValue<>(itemrepair);
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
