/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v3_2017_10;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v3_2017_10.implementation.DatabaseInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v3_2017_10.implementation.SqlManager;
import java.util.UUID;
import org.joda.time.DateTime;
import java.util.Map;

/**
 * Type representing Database.
 */
public interface Database extends HasInner<DatabaseInner>, Indexable, Refreshable<Database>, Updatable<Database.Update>, HasManager<SqlManager> {
    /**
     * @return the catalogCollation value.
     */
    CatalogCollationType catalogCollation();

    /**
     * @return the collation value.
     */
    String collation();

    /**
     * @return the createMode value.
     */
    CreateMode createMode();

    /**
     * @return the creationDate value.
     */
    DateTime creationDate();

    /**
     * @return the currentServiceObjectiveName value.
     */
    String currentServiceObjectiveName();

    /**
     * @return the currentSku value.
     */
    Sku currentSku();

    /**
     * @return the databaseId value.
     */
    UUID databaseId();

    /**
     * @return the defaultSecondaryLocation value.
     */
    String defaultSecondaryLocation();

    /**
     * @return the earliestRestoreDate value.
     */
    DateTime earliestRestoreDate();

    /**
     * @return the elasticPoolId value.
     */
    String elasticPoolId();

    /**
     * @return the failoverGroupId value.
     */
    String failoverGroupId();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the licenseType value.
     */
    DatabaseLicenseType licenseType();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the longTermRetentionBackupResourceId value.
     */
    String longTermRetentionBackupResourceId();

    /**
     * @return the managedBy value.
     */
    String managedBy();

    /**
     * @return the maxLogSizeBytes value.
     */
    Long maxLogSizeBytes();

    /**
     * @return the maxSizeBytes value.
     */
    Long maxSizeBytes();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the readScale value.
     */
    DatabaseReadScale readScale();

    /**
     * @return the recoverableDatabaseId value.
     */
    String recoverableDatabaseId();

    /**
     * @return the recoveryServicesRecoveryPointId value.
     */
    String recoveryServicesRecoveryPointId();

    /**
     * @return the requestedServiceObjectiveName value.
     */
    String requestedServiceObjectiveName();

    /**
     * @return the restorableDroppedDatabaseId value.
     */
    String restorableDroppedDatabaseId();

    /**
     * @return the restorePointInTime value.
     */
    DateTime restorePointInTime();

    /**
     * @return the sampleName value.
     */
    SampleName sampleName();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the sourceDatabaseDeletionDate value.
     */
    DateTime sourceDatabaseDeletionDate();

    /**
     * @return the sourceDatabaseId value.
     */
    String sourceDatabaseId();

    /**
     * @return the status value.
     */
    DatabaseStatus status();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the zoneRedundant value.
     */
    Boolean zoneRedundant();

    /**
     * The entirety of the Database definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithServer, DefinitionStages.WithLocation, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Database definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Database definition.
         */
        interface Blank extends WithServer {
        }

        /**
         * The stage of the database definition allowing to specify Server.
         */
        interface WithServer {
           /**
            * Specifies resourceGroupName, serverName.
            */
            WithLocation withExistingServer(String resourceGroupName, String serverName);
        }

        /**
         * The stage of the database definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the database definition allowing to specify CatalogCollation.
         */
        interface WithCatalogCollation {
            /**
             * Specifies catalogCollation.
             */
            WithCreate withCatalogCollation(CatalogCollationType catalogCollation);
        }

        /**
         * The stage of the database definition allowing to specify Collation.
         */
        interface WithCollation {
            /**
             * Specifies collation.
             */
            WithCreate withCollation(String collation);
        }

        /**
         * The stage of the database definition allowing to specify CreateMode.
         */
        interface WithCreateMode {
            /**
             * Specifies createMode.
             */
            WithCreate withCreateMode(CreateMode createMode);
        }

        /**
         * The stage of the database definition allowing to specify ElasticPoolId.
         */
        interface WithElasticPoolId {
            /**
             * Specifies elasticPoolId.
             */
            WithCreate withElasticPoolId(String elasticPoolId);
        }

        /**
         * The stage of the database definition allowing to specify LicenseType.
         */
        interface WithLicenseType {
            /**
             * Specifies licenseType.
             */
            WithCreate withLicenseType(DatabaseLicenseType licenseType);
        }

        /**
         * The stage of the database definition allowing to specify LongTermRetentionBackupResourceId.
         */
        interface WithLongTermRetentionBackupResourceId {
            /**
             * Specifies longTermRetentionBackupResourceId.
             */
            WithCreate withLongTermRetentionBackupResourceId(String longTermRetentionBackupResourceId);
        }

        /**
         * The stage of the database definition allowing to specify MaxSizeBytes.
         */
        interface WithMaxSizeBytes {
            /**
             * Specifies maxSizeBytes.
             */
            WithCreate withMaxSizeBytes(Long maxSizeBytes);
        }

        /**
         * The stage of the database definition allowing to specify ReadScale.
         */
        interface WithReadScale {
            /**
             * Specifies readScale.
             */
            WithCreate withReadScale(DatabaseReadScale readScale);
        }

        /**
         * The stage of the database definition allowing to specify RecoverableDatabaseId.
         */
        interface WithRecoverableDatabaseId {
            /**
             * Specifies recoverableDatabaseId.
             */
            WithCreate withRecoverableDatabaseId(String recoverableDatabaseId);
        }

        /**
         * The stage of the database definition allowing to specify RecoveryServicesRecoveryPointId.
         */
        interface WithRecoveryServicesRecoveryPointId {
            /**
             * Specifies recoveryServicesRecoveryPointId.
             */
            WithCreate withRecoveryServicesRecoveryPointId(String recoveryServicesRecoveryPointId);
        }

        /**
         * The stage of the database definition allowing to specify RestorableDroppedDatabaseId.
         */
        interface WithRestorableDroppedDatabaseId {
            /**
             * Specifies restorableDroppedDatabaseId.
             */
            WithCreate withRestorableDroppedDatabaseId(String restorableDroppedDatabaseId);
        }

        /**
         * The stage of the database definition allowing to specify RestorePointInTime.
         */
        interface WithRestorePointInTime {
            /**
             * Specifies restorePointInTime.
             */
            WithCreate withRestorePointInTime(DateTime restorePointInTime);
        }

        /**
         * The stage of the database definition allowing to specify SampleName.
         */
        interface WithSampleName {
            /**
             * Specifies sampleName.
             */
            WithCreate withSampleName(SampleName sampleName);
        }

        /**
         * The stage of the database definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the database definition allowing to specify SourceDatabaseDeletionDate.
         */
        interface WithSourceDatabaseDeletionDate {
            /**
             * Specifies sourceDatabaseDeletionDate.
             */
            WithCreate withSourceDatabaseDeletionDate(DateTime sourceDatabaseDeletionDate);
        }

        /**
         * The stage of the database definition allowing to specify SourceDatabaseId.
         */
        interface WithSourceDatabaseId {
            /**
             * Specifies sourceDatabaseId.
             */
            WithCreate withSourceDatabaseId(String sourceDatabaseId);
        }

        /**
         * The stage of the database definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the database definition allowing to specify ZoneRedundant.
         */
        interface WithZoneRedundant {
            /**
             * Specifies zoneRedundant.
             */
            WithCreate withZoneRedundant(Boolean zoneRedundant);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Database>, DefinitionStages.WithCatalogCollation, DefinitionStages.WithCollation, DefinitionStages.WithCreateMode, DefinitionStages.WithElasticPoolId, DefinitionStages.WithLicenseType, DefinitionStages.WithLongTermRetentionBackupResourceId, DefinitionStages.WithMaxSizeBytes, DefinitionStages.WithReadScale, DefinitionStages.WithRecoverableDatabaseId, DefinitionStages.WithRecoveryServicesRecoveryPointId, DefinitionStages.WithRestorableDroppedDatabaseId, DefinitionStages.WithRestorePointInTime, DefinitionStages.WithSampleName, DefinitionStages.WithSku, DefinitionStages.WithSourceDatabaseDeletionDate, DefinitionStages.WithSourceDatabaseId, DefinitionStages.WithTags, DefinitionStages.WithZoneRedundant {
        }
    }
    /**
     * The template for a Database update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Database>, UpdateStages.WithCatalogCollation, UpdateStages.WithCollation, UpdateStages.WithCreateMode, UpdateStages.WithElasticPoolId, UpdateStages.WithLicenseType, UpdateStages.WithLongTermRetentionBackupResourceId, UpdateStages.WithMaxSizeBytes, UpdateStages.WithReadScale, UpdateStages.WithRecoverableDatabaseId, UpdateStages.WithRecoveryServicesRecoveryPointId, UpdateStages.WithRestorableDroppedDatabaseId, UpdateStages.WithRestorePointInTime, UpdateStages.WithSampleName, UpdateStages.WithSku, UpdateStages.WithSourceDatabaseDeletionDate, UpdateStages.WithSourceDatabaseId, UpdateStages.WithTags, UpdateStages.WithZoneRedundant {
    }

    /**
     * Grouping of Database update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the database update allowing to specify CatalogCollation.
         */
        interface WithCatalogCollation {
            /**
             * Specifies catalogCollation.
             */
            Update withCatalogCollation(CatalogCollationType catalogCollation);
        }

        /**
         * The stage of the database update allowing to specify Collation.
         */
        interface WithCollation {
            /**
             * Specifies collation.
             */
            Update withCollation(String collation);
        }

        /**
         * The stage of the database update allowing to specify CreateMode.
         */
        interface WithCreateMode {
            /**
             * Specifies createMode.
             */
            Update withCreateMode(CreateMode createMode);
        }

        /**
         * The stage of the database update allowing to specify ElasticPoolId.
         */
        interface WithElasticPoolId {
            /**
             * Specifies elasticPoolId.
             */
            Update withElasticPoolId(String elasticPoolId);
        }

        /**
         * The stage of the database update allowing to specify LicenseType.
         */
        interface WithLicenseType {
            /**
             * Specifies licenseType.
             */
            Update withLicenseType(DatabaseLicenseType licenseType);
        }

        /**
         * The stage of the database update allowing to specify LongTermRetentionBackupResourceId.
         */
        interface WithLongTermRetentionBackupResourceId {
            /**
             * Specifies longTermRetentionBackupResourceId.
             */
            Update withLongTermRetentionBackupResourceId(String longTermRetentionBackupResourceId);
        }

        /**
         * The stage of the database update allowing to specify MaxSizeBytes.
         */
        interface WithMaxSizeBytes {
            /**
             * Specifies maxSizeBytes.
             */
            Update withMaxSizeBytes(Long maxSizeBytes);
        }

        /**
         * The stage of the database update allowing to specify ReadScale.
         */
        interface WithReadScale {
            /**
             * Specifies readScale.
             */
            Update withReadScale(DatabaseReadScale readScale);
        }

        /**
         * The stage of the database update allowing to specify RecoverableDatabaseId.
         */
        interface WithRecoverableDatabaseId {
            /**
             * Specifies recoverableDatabaseId.
             */
            Update withRecoverableDatabaseId(String recoverableDatabaseId);
        }

        /**
         * The stage of the database update allowing to specify RecoveryServicesRecoveryPointId.
         */
        interface WithRecoveryServicesRecoveryPointId {
            /**
             * Specifies recoveryServicesRecoveryPointId.
             */
            Update withRecoveryServicesRecoveryPointId(String recoveryServicesRecoveryPointId);
        }

        /**
         * The stage of the database update allowing to specify RestorableDroppedDatabaseId.
         */
        interface WithRestorableDroppedDatabaseId {
            /**
             * Specifies restorableDroppedDatabaseId.
             */
            Update withRestorableDroppedDatabaseId(String restorableDroppedDatabaseId);
        }

        /**
         * The stage of the database update allowing to specify RestorePointInTime.
         */
        interface WithRestorePointInTime {
            /**
             * Specifies restorePointInTime.
             */
            Update withRestorePointInTime(DateTime restorePointInTime);
        }

        /**
         * The stage of the database update allowing to specify SampleName.
         */
        interface WithSampleName {
            /**
             * Specifies sampleName.
             */
            Update withSampleName(SampleName sampleName);
        }

        /**
         * The stage of the database update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            Update withSku(Sku sku);
        }

        /**
         * The stage of the database update allowing to specify SourceDatabaseDeletionDate.
         */
        interface WithSourceDatabaseDeletionDate {
            /**
             * Specifies sourceDatabaseDeletionDate.
             */
            Update withSourceDatabaseDeletionDate(DateTime sourceDatabaseDeletionDate);
        }

        /**
         * The stage of the database update allowing to specify SourceDatabaseId.
         */
        interface WithSourceDatabaseId {
            /**
             * Specifies sourceDatabaseId.
             */
            Update withSourceDatabaseId(String sourceDatabaseId);
        }

        /**
         * The stage of the database update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the database update allowing to specify ZoneRedundant.
         */
        interface WithZoneRedundant {
            /**
             * Specifies zoneRedundant.
             */
            Update withZoneRedundant(Boolean zoneRedundant);
        }

    }
}