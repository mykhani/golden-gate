// Copyright 2017-2020 Fitbit, Inc
// SPDX-License-Identifier: Apache-2.0

package com.fitbit.bluetooth.fbgatt.rx.scanner

import com.fitbit.bluetooth.fbgatt.FitbitGatt

/**
 * Add a single filter for scanning peripheral by device name
 *
 * @param deviceName device name to add for scanning filter
 */
class DeviceNamePeripheralScannerFilter(
        private val deviceName: String
) : PeripheralScannerFilter {

    override fun add(fitbitGatt: FitbitGatt) {
        fitbitGatt.addDeviceNameScanFilter(deviceName)
    }
}
