package com.ljmu.andre.snaptools.ModulePack.Utils;

/**
 * This class was created by Andre R M (SID: 701439)
 * It and its contents are free to use by all
 */

public interface Provider<I, O> {
	O call(I i);
}