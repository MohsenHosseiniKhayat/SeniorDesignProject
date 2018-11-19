package com.cmpe195.mohsenhosseinikhayat.seniordesignproject.CustomViews;

import android.animation.Animator;
import android.view.ViewGroup;
import android.view.animation.Animation;

import com.willowtreeapps.spruce.Spruce;
import com.willowtreeapps.spruce.animation.DefaultAnimations;
import com.willowtreeapps.spruce.sort.DefaultSort;

public class Animations
{
    /**
     * SpruceBuilder constructor that takes a ViewGroup
     *
     * @param viewGroup to apply animations and other operations to
     */
    public static void AnimateRecyclerView(ViewGroup viewGroup)
    {
        Animator spruceAnimator = new Spruce
                .SpruceBuilder(viewGroup)
                .sortWith(new DefaultSort(50L))
                .animateWith(new Animator[] {DefaultAnimations.growAnimator(viewGroup,500)})
                .start();
    }
}
