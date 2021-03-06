/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2018_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2018_04_01.implementation.ComputeManager;
import org.joda.time.DateTime;
import com.microsoft.azure.management.compute.v2018_04_01.implementation.SnapshotInner;

/**
 * Type representing Snapshot.
 */
public interface Snapshot extends HasInner<SnapshotInner>, Resource, GroupableResourceCore<ComputeManager, SnapshotInner>, HasResourceGroup, Refreshable<Snapshot>, Updatable<Snapshot.Update>, HasManager<ComputeManager> {
    /**
     * @return the creationData value.
     */
    CreationData creationData();

    /**
     * @return the diskSizeGB value.
     */
    Integer diskSizeGB();

    /**
     * @return the encryptionSettings value.
     */
    EncryptionSettings encryptionSettings();

    /**
     * @return the managedBy value.
     */
    String managedBy();

    /**
     * @return the osType value.
     */
    OperatingSystemTypes osType();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the sku value.
     */
    SnapshotSku sku();

    /**
     * @return the timeCreated value.
     */
    DateTime timeCreated();

    /**
     * The entirety of the Snapshot definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreationData, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Snapshot definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Snapshot definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Snapshot definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreationData> {
        }

        /**
         * The stage of the snapshot definition allowing to specify CreationData.
         */
        interface WithCreationData {
           /**
            * Specifies creationData.
            */
            WithCreate withCreationData(CreationData creationData);
        }

        /**
         * The stage of the snapshot update allowing to specify DiskSizeGB.
         */
        interface WithDiskSizeGB {
            /**
             * Specifies diskSizeGB.
             */
            WithCreate withDiskSizeGB(Integer diskSizeGB);
        }

        /**
         * The stage of the snapshot update allowing to specify EncryptionSettings.
         */
        interface WithEncryptionSettings {
            /**
             * Specifies encryptionSettings.
             */
            WithCreate withEncryptionSettings(EncryptionSettings encryptionSettings);
        }

        /**
         * The stage of the snapshot update allowing to specify OsType.
         */
        interface WithOsType {
            /**
             * Specifies osType.
             */
            WithCreate withOsType(OperatingSystemTypes osType);
        }

        /**
         * The stage of the snapshot update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            WithCreate withSku(SnapshotSku sku);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Snapshot>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithDiskSizeGB, DefinitionStages.WithEncryptionSettings, DefinitionStages.WithOsType, DefinitionStages.WithSku {
        }
    }
    /**
     * The template for a Snapshot update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Snapshot>, Resource.UpdateWithTags<Update>, UpdateStages.WithDiskSizeGB, UpdateStages.WithEncryptionSettings, UpdateStages.WithOsType, UpdateStages.WithSku {
    }

    /**
     * Grouping of Snapshot update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the snapshot {0} allowing to specify DiskSizeGB.
         */
        interface WithDiskSizeGB {
            /**
             * Specifies diskSizeGB.
             */
            Update withDiskSizeGB(Integer diskSizeGB);
        }

        /**
         * The stage of the snapshot {0} allowing to specify EncryptionSettings.
         */
        interface WithEncryptionSettings {
            /**
             * Specifies encryptionSettings.
             */
            Update withEncryptionSettings(EncryptionSettings encryptionSettings);
        }

        /**
         * The stage of the snapshot {0} allowing to specify OsType.
         */
        interface WithOsType {
            /**
             * Specifies osType.
             */
            Update withOsType(OperatingSystemTypes osType);
        }

        /**
         * The stage of the snapshot {0} allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            Update withSku(SnapshotSku sku);
        }

    }
}
