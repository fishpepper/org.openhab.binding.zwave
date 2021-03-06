/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.zwave.internal.protocol.transaction;

import java.util.Comparator;

import org.openhab.binding.zwave.internal.protocol.ZWaveController;

/**
 *
 * @author Chris Jackson - Initial Contribution
 *
 */
public class ZWaveCommandClassTransactionPayloadComparator implements Comparator<ZWaveCommandClassTransactionPayload> {

    /**
     * Constructor. Creates a new instance of the SerialMessageComparator class.
     *
     * @param controller the {@link ZWaveController to use}
     */
    public ZWaveCommandClassTransactionPayloadComparator() {
        // this.controller = controller;
    }

    /**
     * Compares a serial message to another serial message.
     * Used by the priority queue to order messages.
     *
     * @param arg0 the first serial message to compare the other to.
     * @param arg1 the other serial message to compare the first one to.
     */
    @Override
    public int compare(ZWaveCommandClassTransactionPayload arg0, ZWaveCommandClassTransactionPayload arg1) {
        return arg0.getPriority().compareTo(arg1.getPriority());
    }
}
