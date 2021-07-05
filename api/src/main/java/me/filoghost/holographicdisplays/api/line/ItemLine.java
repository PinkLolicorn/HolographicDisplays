/*
 * Copyright (C) filoghost and contributors
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */
package me.filoghost.holographicdisplays.api.line;

import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

/**
 * @since 1
 */
public interface ItemLine extends CollectableLine, TouchableLine {

    /**
     * Returns the ItemStack of this ItemLine.
     *
     * @return the ItemStack if this ItemLine.
     * @since 1
     */
    @Nullable ItemStack getItemStack();

    /**
     * Sets the ItemStack for this ItemLine.
     *
     * @param itemStack the new item, should not be null.
     * @since 1
     */
    void setItemStack(@Nullable ItemStack itemStack);

}