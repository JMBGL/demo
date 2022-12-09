package com.practice.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: Jet Ma
 * @Created: 2022-12-09
 *
 * Type	Storage (Bytes)	Minimum Value Signed	Minimum Value Unsigned	Maximum Value Signed	Maximum Value Unsigned
 * TINYINT	1	-128	0	127	255
 * SMALLINT	2	-32768	0	32767	65535
 * MEDIUMINT	3	-8388608	0	8388607	16777215
 * INT	4	-2147483648	0	2147483647	4294967295
 * BIGINT	8	-263	0	263-1	264-1
 */
@Data
@Entity
@Table(name = "wrapplatformfeedprovider")
public class WrapPlatformFeedProvider {
    @Id
    private Long id;

    // the string for the name value should be in lowercase
    @Column(name = "providername")
    private boolean providerName;
    @Column(name = "authorisationrequired")
    private boolean authorisationRequired;
    @Column(name = "bankaccountrequired")
    private boolean bankAccountRequired;
    @Column(name = "bankaccountoptional")
    private boolean bankAccountOptional;
    @Column(name = "advisercoderequired")
    private boolean adviserCodeRequired;
    @Column(name = "externalaccountidrequired")
    private boolean externalAccountIdRequired;
    @Column(name = "lrbacontrolaccountrequired")
    private boolean lrbaControlAccountRequired;
    @Column(name = "nonunitisedaccountrequired")
    private boolean nonUnitisedAccountRequired;
    @Column(name = "advancesettingsrequired")
    private boolean advanceSettingsRequired;
    @Column(name = "importforeignexchange")
    private boolean importForeignExchange;
    @Column(name = "disposalparcelmatch")
    private boolean disposalParcelMatch;
    @Column(name = "availableforselection")
    private boolean availableForSelection;
    @Column(name = "externalrefaccountidtaccount")
    private boolean externalRefAccountIdTAccount;
    private boolean active;
    private String manual;
    @Column(name = "portfoliocodeinfo")
    private String portfolioCodeInfo;
    @Column(name = "incomecomponentinfo")
    private String incomeComponentInfo;
    private String config;
    @Column(name = "authoritydetails")
    private String authorityDetails;

}
