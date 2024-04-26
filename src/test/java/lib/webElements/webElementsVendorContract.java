package lib.webElements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.LocalDate;

import static com.codeborne.selenide.Selenide.$;

public class webElementsVendorContract {
    //Элементы Шага 0
    public static SelenideElement radiobuttonStep0Help = $("#pathwise_radio_help");
    public static SelenideElement buttonSubmitStep0 = $(By.xpath("//button[contains(.,'Продолжить')]"));
    public static SelenideElement radiobuttonStepONO = $(By.xpath(("//input[@value='Нет']")));
    public static SelenideElement radiobuttonStepOYes = $(By.xpath(("//input[@value='Да']")));
    public static SelenideElement labelRadiobuttonNO = $(By.xpath("//input[@value='Нет']/../../span[2]"));
    public static SelenideElement labelRadiobuttonYes = $(By.xpath("//input[@value='Да']/../../span[2]"));
    public static SelenideElement selectedCheckbox = $(By.xpath("//div[@aria-required='true']"));
    public static SelenideElement subtitleVendorContract = $(By.xpath("//div[@role='alert']/following-sibling::div/span/h2"));
    //Элементы Шага 1
    public static SelenideElement subtitleStep1 = $(By.xpath("//div[@role='alert']/following-sibling::div[4]/following-sibling::form/div"));
    public static SelenideElement buttonBackStep1 = $(By.xpath("//button[contains(.,'Назад')]"));
    public static SelenideElement buttonSubmitStep1 = $(By.xpath("//button[contains(.,'Продолжить')]"));
    public static SelenideElement managementSelectStep1 = $(By.xpath("//input[@id='generateContract_informationEntity_managment']/parent::span/parent::div"));
    public static SelenideElement managementListStep1 = $("#generateContract_informationEntity_managment");
    public static SelenideElement step1ManagementHelp= $("#generateContract_informationEntity_managment_help");
    public static SelenideElement ogrnStep1= $("#generateContract_informationEntity_ogrn");
    public static SelenideElement step1OGRNHelp= $("#generateContract_informationEntity_ogrn_help");
    public static SelenideElement fioSignatoryStep1= $("#generateContract_agreement_fioSignatory");
    public static SelenideElement step1FIOSignatoryHelp= $("#generateContract_agreement_fioSignatory_help");
    public static SelenideElement step1FIOSignatoryExtra= $("#generateContract_agreement_fioSignatory_extra");
    public static SelenideElement positionSignatoryStep1= $("#generateContract_agreement_positionSignatory");
    public static SelenideElement step1PositionSignatoryHelp= $("#generateContract_agreement_positionSignatory_help");
    public static SelenideElement step1PositionSignatoryExtra= $("#generateContract_agreement_positionSignatory_extra");
    public static SelenideElement fioPropsStep1= $("#generateContract_agreement_fioProps");
    public static SelenideElement step1FIOPropsHelp= $("#generateContract_agreement_fioProps_help");
    public static SelenideElement step1FIOPropsExtra= $("#generateContract_agreement_fioProps_extra");
    public static SelenideElement positionPropsStep1= $("#generateContract_agreement_positionProps");
    public static SelenideElement step1PositionPropsHelp= $("#generateContract_agreement_positionProps_help");
    public static SelenideElement step1PositionPropsExtra= $("#generateContract_agreement_positionProps_extra");
    public static SelenideElement emailStep1= $("#generateContract_agreement_emailMerch");
    public static SelenideElement step1EmailHelp= $("#generateContract_agreement_emailMerch_help");
    public static SelenideElement juroAddressStep1= $("#generateContract_agreement_legalAddress");
    public static SelenideElement step1JuroAddressHelp= $("#generateContract_agreement_legalAddress_help");
    public static SelenideElement factoAddressStep1= $("#generateContract_agreement_actualAddress");
    public static SelenideElement step1FactoAddressHelp= $("#generateContract_agreement_actualAddress_help");
    public static SelenideElement checkboxAddressStep1 = $("#generateContract_agreement_checkbox");
    public static SelenideElement checkboxAddressIsCheckedStep1 = $(By.xpath("//input[@id='generateContract_agreement_checkbox']/parent::span[contains(@class,'checked')]"));
    public static SelenideElement checkboxAddressTitleStep1 = $(By.xpath("//input[@id='generateContract_agreement_checkbox']/parent::span/following-sibling::span"));
    public static SelenideElement rightToSignSelectStep1 = $(By.xpath("//input[@id='generateContract_agreement_rightToSign']/parent::span/parent::div"));
    public static SelenideElement rightToSignListStep1 = $("#generateContract_agreement_rightToSign");
    public static SelenideElement step1RightToSignHelp= $("#generateContract_agreement_rightToSign_help");
    public static SelenideElement rightToSignNumberStep1= $("#generateContract_agreement_number");
    public static SelenideElement step1RightToSignNumberHelp= $("#generateContract_agreement_number_help");
    public static SelenideElement rightToSignDateStep1= $("#generateContract_agreement_date");
    static String twoDaysAgo = lib.ui.MainPageObject.GetDayTwoDaysAgo();
    public static SelenideElement rightToSignNumberOfDayStep1 = $(By.xpath("//tbody/tr//td[contains(.,"+twoDaysAgo+")]"));
    public static SelenideElement bikStep1= $("#generateContract_bankDetails_bik");
    public static SelenideElement step1BIKHelp= $("#generateContract_bankDetails_bik_help");
    public static SelenideElement nameBankStep1= $("#generateContract_bankDetails_nameBank");
    public static SelenideElement step1NameBankHelp= $("#generateContract_bankDetails_nameBank_help");
    public static SelenideElement correspondentAccountStep1= $("#generateContract_bankDetails_correspondentAccount");
    public static SelenideElement step1CorrespondentAccountHelp= $("#generateContract_bankDetails_correspondentAccount_help");
    public static SelenideElement currentAccountStep1= $("#generateContract_bankDetails_currentAccount");
    public static SelenideElement step1CurrentAccountHelp= $("#generateContract_bankDetails_currentAccount_help");
    //Элементы Шага 2
    public static SelenideElement buttonSubmitStep2 = $(By.xpath("//button[contains(.,'Продолжить')]"));
    public static SelenideElement buttonBackStep2 = $(By.xpath("//button[contains(.,'Назад')]"));
    public static SelenideElement buttonAddLineStep2 = $(By.xpath("//button[contains(.,'Добавить строку')]"));
    public static SelenideElement defermentStep2 = $(By.xpath("//input[contains(@id,'deferment')]"));
    public static SelenideElement groupStep2 = $(By.xpath("//input[contains(@id,'group')]"));
    public static SelenideElement nameStep2 = $(By.xpath("//input[contains(@id,'name')]"));
    public static SelenideElement discountStep2 = $(By.xpath("//input[contains(@id,'disk')]"));
    public static SelenideElement questionStep2 = $(By.xpath("//div[@class='ant-input-number-group-addon']"));
    public static SelenideElement tooltipStep2 = $(By.xpath("//div[@class='ant-input-number-group-addon']/div[@class='ant-tooltip-open']"));
    public static SelenideElement step2DefermentHelp= $(By.xpath("//div[contains(@id,'deferment_help')]"));
    public static SelenideElement step2ProductGroupHelp = $(By.xpath("//div[contains(@id,'group_help')]"));
    public static SelenideElement step2NameOfProductHelp = $(By.xpath("//div[contains(@id,'name_help')]"));
    public static SelenideElement step2DiscountHelp = $(By.xpath("//div[contains(@id,'disk_help')]"));
    public static SelenideElement step2ProductGroupHelpLine2 = $(By.xpath("//tbody/tr[3]/td[1]"));
    public static SelenideElement groupLine2Step2 = $(By.xpath("//tbody/tr[3]/td[1]/div/div/div/div[contains(@class,'input')]/div[contains(@class,'input-content')]/input"));
    public static SelenideElement step2NameOfProductHelpLine2 = $(By.xpath("//tbody/tr[3]/td[2]"));
    public static SelenideElement nameLine2Step2 = $(By.xpath("//tbody/tr[3]/td[2]/div/div/div/div[contains(@class,'input')]/div[contains(@class,'input-content')]/input"));
    public static SelenideElement step2DiscountHelpLine2 = $(By.xpath("//tbody/tr[3]/td[3]"));
    public static SelenideElement discountLine2Step2 = $(By.xpath("//tbody/tr[3]/td[3]/div/div/div/div[contains(@class,'input')]/div//input"));
    public static SelenideElement buttonDeleteLine2Step2 = $(By.xpath("//tbody/tr[3]/td[4]/button[contains(.,'Удалить')]"));
    public static SelenideElement step2ProductGroupHelpLine3 = $(By.xpath("//tbody/tr[4]/td[1]"));
    public static SelenideElement step2NameOfProductHelpLine3 = $(By.xpath("//tbody/tr[4]/td[2]"));
    public static SelenideElement step2DiscountHelpLine3 = $(By.xpath("//tbody/tr[4]/td[3]"));

    //Элементы Шага 3
    public static SelenideElement sibtitleTable1Step3 = $(By.xpath("//div[contains(@class,'VendorContractForm_steps')]/following-sibling::div/div[1]"));
    public static SelenideElement buttonSubmitStep3 = $(By.xpath("//button[contains(.,'Сгенерировать договор')]"));
    public static SelenideElement buttonBackStep3 = $(By.xpath("//button[contains(.,'Назад')]"));
      //таблица Наполнение каталога

    //static String yesterday = lib.ui.MainPageObject.GetYesterday();
    static String yesterdayForTitle = lib.ui.MainPageObject.GetFullDateYesterdayForTitle();
    static String weekAfterTodayForTitle = lib.ui.MainPageObject.GetFullDateWeekAfterTodayForTitle();
    static String monthAfterTodayForTitle = lib.ui.MainPageObject.GetFullDateMonthAfterTodayForTitle();
    static String weekAfterTodayForXPath = "'"+weekAfterTodayForTitle+"'";
    static String monthAfterTodayForXPath = "'"+monthAfterTodayForTitle+"'";
    static String yesterdayForXPath = "'"+yesterdayForTitle+"'";


    public static SelenideElement pickerButtonPreviousMonth = $(By.xpath("//textarea/following-sibling::div[last()]//div[contains(@class,'picker-date-panel')]//button[contains(@class,'picker-header-prev')]"));
    public static SelenideElement pickerButtonNextMonth =  $(By.xpath("//textarea/following-sibling::div[last()]//div[contains(@class,'picker-date-panel')]//button[contains(@class,'picker-header-next')]"));
    public static SelenideElement pickerCalendarMonthDateStep3 = $(By.xpath("//textarea/following-sibling::div[last()]//table[contains(@class,'ant-picker-content')]/tbody//td[@title="+monthAfterTodayForXPath+"]"));
    public static SelenideElement pickerCalendarEnableStep3 = $(By.xpath("//textarea/following-sibling::div[last()]//table[contains(@class,'ant-picker-content')]/tbody//td[@title="+yesterdayForXPath+"]"));
    public static SelenideElement pickerCalendarWeekAfterTodayStep3 = $(By.xpath("//textarea/following-sibling::div[last()]//table[contains(@class,'ant-picker-content')]/tbody//td[@title="+weekAfterTodayForXPath+"]"));

    public static SelenideElement imageGoodTransferSelectStep3 = $(By.xpath("//tr[contains(@data-row-key,'imageGood')]/td[2]//div[contains(@class,'ant-select-outlined')]"));
    public static SelenideElement imageGoodTransferListStep3 = $(By.xpath("//input[contains(@id,'imageGood_transfer')]"));
    public static SelenideElement imageGoodTransferVariantStep3 = $(By.xpath("//div[contains(@id,'imageGood_transfer_list')][@role='listbox']/following-sibling::div//div[@class='rc-virtual-list-holder-inner']/div[contains(@class,'item-option-active')]/div"));
    public static SelenideElement imageGoodTransferInputStep3 = $(By.xpath("//input[contains(@id,'imageGood_transfer')]/parent::span/following-sibling::span"));
    public static SelenideElement imageGoodsDatePickerStep3 = $(By.xpath("//input[contains(@id,'productInfo_imageGood_date')]/parent::div/parent::div"));
    public static SelenideElement imageGoodsDateInputStep3 = $(By.xpath("//input[contains(@id,'productInfo_imageGood_date')]"));
    public static SelenideElement step3ImageGoodsDateHelp = $(By.xpath("//div[contains(@id,'imageGood_date_help')]"));

    public static SelenideElement configuratorTransferSelectStep3 = $(By.xpath("//tr[contains(@data-row-key,'configurator')]/td[2]//div[contains(@class,'ant-select-outlined')]"));
    public static SelenideElement configuratorTransferListStep3 = $(By.xpath("//input[contains(@id,'configurator_transfer')]"));
    public static SelenideElement configuratorTransferVariantStep3 = $(By.xpath("//div[contains(@id,'configurator_transfer_list')][@role='listbox']/following-sibling::div//div[@class='rc-virtual-list-holder-inner']/div[contains(@class,'item-option-active')]/div"));
    public static SelenideElement configuratorTransferInputStep3 = $(By.xpath("//input[contains(@id,'configurator_transfer')]/parent::span/following-sibling::span"));
    public static SelenideElement configuratorDatePickerStep3 = $(By.xpath("//input[contains(@id,'productInfo_configurator_date')]/parent::div/parent::div"));
    public static SelenideElement configuratorDateInputStep3 = $(By.xpath("//input[contains(@id,'productInfo_configurator_date')]"));
    public static SelenideElement step3ConfiguratorDateHelp = $(By.xpath("//div[contains(@id,'configurator_date_help')]"));

    public static SelenideElement techInfoTransferSelectStep3 = $(By.xpath("//tr[contains(@data-row-key,'technicalInfo')]/td[2]//div[contains(@class,'ant-select-outlined')]"));
    public static SelenideElement techInfoTransferListStep3 = $(By.xpath("//input[contains(@id,'technicalInfo_transfer')]"));
    public static SelenideElement techInfoTransferVariantStep3 = $(By.xpath("//div[contains(@id,'technicalInfo_transfer_list')][@role='listbox']/following-sibling::div//div[@class='rc-virtual-list-holder-inner']/div[contains(@class,'item-option-active')]/div"));
    public static SelenideElement techInfoTransferInputStep3 = $(By.xpath("//input[contains(@id,'technicalInfo_transfer')]/parent::span/following-sibling::span"));
    public static SelenideElement techInfoDateInputStep3 = $(By.xpath("//input[contains(@id,'productInfo_technicalInfo_date')]"));
    public static SelenideElement techInfoDatePickerStep3 = $(By.xpath("//input[contains(@id,'productInfo_technicalInfo_date')]/parent::div/parent::div"));
    public static SelenideElement step3TechInfoDateHelp = $(By.xpath("//div[contains(@id,'technicalInfo_date_help')]"));

    public static SelenideElement currentCertificatesTransferSelectStep3 = $(By.xpath("//tr[contains(@data-row-key,'currentCertificates')]/td[2]//div[contains(@class,'ant-select-outlined')]"));
    public static SelenideElement currentCertificatesTransferListStep3 = $(By.xpath("//input[contains(@id,'currentCertificates_transfer')]"));
    public static SelenideElement currentCertificatesTransferVariantStep3 = $(By.xpath("//div[contains(@id,'currentCertificates_transfer_list')][@role='listbox']/following-sibling::div//div[@class='rc-virtual-list-holder-inner']/div[contains(@class,'item-option-active')]/div"));
    public static SelenideElement currentCertificatesTransferInputStep3 = $(By.xpath("//input[contains(@id,'currentCertificates_transfer')]/parent::span/following-sibling::span"));
    public static SelenideElement currentCertificatesDateInputStep3 = $(By.xpath("//input[contains(@id,'productInfo_currentCertificates_date')]"));
    public static SelenideElement currentCertificatesPickerStep3 = $(By.xpath("//input[contains(@id,'productInfo_currentCertificates_date')]/parent::div/parent::div"));
    public static SelenideElement step3CurrentCertificatesDateHelp = $(By.xpath("//div[contains(@id,'currentCertificates_date_help')]"));

    public static SelenideElement productDescriptionTransferSelectStep3 = $(By.xpath("//tr[contains(@data-row-key,'productDescription')]/td[2]//div[contains(@class,'ant-select-outlined')]"));
    public static SelenideElement productDescriptionTransferListStep3 = $(By.xpath("//input[contains(@id,'productDescription_transfer')]"));
    public static SelenideElement productDescriptionTransferVariantStep3 = $(By.xpath("//div[contains(@id,'productDescription_transfer_list')][@role='listbox']/following-sibling::div//div[@class='rc-virtual-list-holder-inner']/div[contains(@class,'item-option-active')]/div"));
    public static SelenideElement productDescriptionTransferInputStep3 = $(By.xpath("//input[contains(@id,'productDescription_transfer')]/parent::span/following-sibling::span"));
    public static SelenideElement productDescriptionDateInputStep3 = $(By.xpath("//input[contains(@id,'productInfo_productDescription_date')]"));
    public static SelenideElement productDescriptionPickerStep3 = $(By.xpath("//input[contains(@id,'productInfo_productDescription_date')]/parent::div/parent::div"));
    public static SelenideElement step3ProductDescriptionDateHelp = $(By.xpath("//div[contains(@id,'productDescription_date_help')]"));

    public static SelenideElement additionalImageGoodTransferSelectStep3 = $(By.xpath("//tr[contains(@data-row-key,'additionalImageGood')]/td[2]//div[contains(@class,'ant-select-outlined')]"));
    public static SelenideElement additionalImageGoodTransferListStep3 = $(By.xpath("//input[contains(@id,'additionalImageGood_transfer')]"));
    public static SelenideElement additionalImageGoodTransferVariantStep3 = $(By.xpath("//div[contains(@id,'additionalImageGood_transfer_list')][@role='listbox']/following-sibling::div//div[@class='rc-virtual-list-holder-inner']/div[contains(@class,'item-option-active')]/div"));
    public static SelenideElement additionalImageGoodTransferInputStep3 = $(By.xpath("//input[contains(@id,'additionalImageGood_transfer')]/parent::span/following-sibling::span"));
    public static SelenideElement additionalImageGoodDateInputStep3 = $(By.xpath("//input[contains(@id,'productInfo_additionalImageGood_date')]"));
    public static SelenideElement additionalImageGoodPickerStep3 = $(By.xpath("//input[contains(@id,'productInfo_additionalImageGood_date')]/parent::div/parent::div"));
    public static SelenideElement step3AdditionalImageGoodDateHelp = $(By.xpath("//div[contains(@id,'additionalImageGood_date_help')]"));

    public static SelenideElement videoMaterialsTransferSelectStep3 = $(By.xpath("//tr[contains(@data-row-key,'videoMaterials')]/td[2]//div[contains(@class,'ant-select-outlined')]"));
    public static SelenideElement videoMaterialsTransferListStep3 = $(By.xpath("//input[contains(@id,'videoMaterials_transfer')]"));
    public static SelenideElement videoMaterialsTransferVariantStep3 = $(By.xpath("//div[contains(@id,'videoMaterials_transfer_list')][@role='listbox']/following-sibling::div//div[@class='rc-virtual-list-holder-inner']/div[contains(@class,'item-option-active')]/div"));
    public static SelenideElement videoMaterialsTransferInputStep3 = $(By.xpath("//input[contains(@id,'videoMaterials_transfer')]/parent::span/following-sibling::span"));
    public static SelenideElement videoMaterialsDateInputStep3 = $(By.xpath("//input[contains(@id,'productInfo_videoMaterials_date')]"));
    public static SelenideElement videoMaterialsPickerStep3 = $(By.xpath("//input[contains(@id,'productInfo_videoMaterials_date')]/parent::div/parent::div"));
    public static SelenideElement step3VideoMaterialsDateHelp = $(By.xpath("//div[contains(@id,'videoMaterials_date_help')]"));

    public static SelenideElement modelTechnicalInfoTransferSelectStep3 = $(By.xpath("//tr[contains(@data-row-key,'modelTechnicalInfo')]/td[2]//div[contains(@class,'ant-select-outlined')]"));
    public static SelenideElement modelTechnicalInfoTransferListStep3 = $(By.xpath("//input[contains(@id,'modelTechnicalInfo_transfer')]"));
    public static SelenideElement modelTechnicalInfoTransferVariantStep3 = $(By.xpath("//div[contains(@id,'modelTechnicalInfo_transfer_list')][@role='listbox']/following-sibling::div//div[@class='rc-virtual-list-holder-inner']/div[contains(@class,'item-option-active')]/div"));
    public static SelenideElement modelTechnicalInfoTransferInputStep3 = $(By.xpath("//input[contains(@id,'modelTechnicalInfo_transfer')]/parent::span/following-sibling::span"));
    public static SelenideElement modelTechInfoDateInputStep3 = $(By.xpath("//input[contains(@id,'productInfo_modelTechnicalInfo_date')]"));
    public static SelenideElement modelTechInfoPickerStep3 = $(By.xpath("//input[contains(@id,'productInfo_modelTechnicalInfo_date')]/parent::div/parent::div"));
    public static SelenideElement step3ModelTechInfoDateHelp = $(By.xpath("//div[contains(@id,'modelTechnicalInfo_date_help')]"));

    public static SelenideElement constructorTransferSelectStep3 = $(By.xpath("//tr[contains(@data-row-key,'constructor')]/td[2]//div[contains(@class,'ant-select-outlined')]"));
    public static SelenideElement constructorTransferListStep3 = $(By.xpath("//input[contains(@id,'constructor_transfer')]"));
    public static SelenideElement constructorTransferVariantStep3 = $(By.xpath("//div[contains(@id,'constructor_transfer_list')][@role='listbox']/following-sibling::div//div[@class='rc-virtual-list-holder-inner']/div[contains(@class,'item-option-active')]/div"));
    public static SelenideElement constructorTransferInputStep3 = $(By.xpath("//input[contains(@id,'constructor_transfer')]/parent::span/following-sibling::span"));
    public static SelenideElement constructorDateInputStep3 = $(By.xpath("//input[contains(@id,'productInfo_constructor_date')]"));
    public static SelenideElement constructorPickerStep3 = $(By.xpath("//input[contains(@id,'productInfo_constructor_date')]/parent::div/parent::div"));
    public static SelenideElement step3ConstructorDateHelp = $(By.xpath("//div[contains(@id,'constructor_date_help')]"));

    public static SelenideElement productAnaloguesTransferSelectStep3 = $(By.xpath("//tr[contains(@data-row-key,'productAnalogues')]/td[2]//div[contains(@class,'ant-select-outlined')]"));
    public static SelenideElement productAnaloguesTransferListStep3 = $(By.xpath("//input[contains(@id,'productAnalogues_transfer')]"));
    public static SelenideElement productAnaloguesTransferVariantStep3 = $(By.xpath("//div[contains(@id,'productAnalogues_transfer_list')][@role='listbox']/following-sibling::div//div[@class='rc-virtual-list-holder-inner']/div[contains(@class,'item-option-active')]/div"));
    public static SelenideElement productAnaloguesTransferInputStep3 = $(By.xpath("//input[contains(@id,'productAnalogues_transfer')]/parent::span/following-sibling::span"));
    public static SelenideElement productAnaloguesDateInputStep3 = $(By.xpath("//input[contains(@id,'productInfo_productAnalogues_date')]"));
    public static SelenideElement productAnaloguesPickerStep3 = $(By.xpath("//input[contains(@id,'productInfo_productAnalogues_date')]/parent::div/parent::div"));
    public static SelenideElement step3ProductAnaloguesDateHelp = $(By.xpath("//div[contains(@id,'productAnalogues_date_help')]"));

    public static SelenideElement similarProductsTransferSelectStep3 = $(By.xpath("//tr[contains(@data-row-key,'similarProducts')]/td[2]//div[contains(@class,'ant-select-outlined')]"));
    public static SelenideElement similarProductsTransferListStep3 = $(By.xpath("//input[contains(@id,'similarProducts_transfer')]"));
    public static SelenideElement similarProductsTransferVariantStep3 = $(By.xpath("//div[contains(@id,'similarProducts_transfer_list')][@role='listbox']/following-sibling::div//div[@class='rc-virtual-list-holder-inner']/div[contains(@class,'item-option-active')]/div"));
    public static SelenideElement similarProductsTransferInputStep3 = $(By.xpath("//input[contains(@id,'similarProducts_transfer')]/parent::span/following-sibling::span"));
    public static SelenideElement similarProductsDateInputStep3 = $(By.xpath("//input[contains(@id,'productInfo_similarProducts_date')]"));
    public static SelenideElement similarProductsPickerStep3 = $(By.xpath("//input[contains(@id,'productInfo_similarProducts_date')]/parent::div/parent::div"));
    public static SelenideElement step3SimilarProductsDateHelp = $(By.xpath("//div[contains(@id,'similarProducts_date_help')]"));

    public static SelenideElement characteristicsDatabaseTransferSelectStep3 = $(By.xpath("//tr[contains(@data-row-key,'characteristicsDatabase')]/td[2]//div[contains(@class,'ant-select-outlined')]"));
    public static SelenideElement characteristicsDatabaseTransferListStep3 = $(By.xpath("//input[contains(@id,'characteristicsDatabase_transfer')]"));
    public static SelenideElement characteristicsDatabaseTransferVariantStep3 = $(By.xpath("//div[contains(@id,'characteristicsDatabase_transfer_list')][@role='listbox']/following-sibling::div//div[@class='rc-virtual-list-holder-inner']/div[contains(@class,'item-option-active')]/div"));
    public static SelenideElement characteristicsDatabaseTransferInputStep3 = $(By.xpath("//input[contains(@id,'characteristicsDatabase_transfer')]/parent::span/following-sibling::span"));
    public static SelenideElement characteristicsDatabaseDateInputStep3 = $(By.xpath("//input[contains(@id,'productInfo_characteristicsDatabase_date')]"));
    public static SelenideElement characteristicsDatabasePickerStep3 = $(By.xpath("//input[contains(@id,'productInfo_characteristicsDatabase_date')]/parent::div/parent::div"));
    public static SelenideElement step3CharacteristicsDatabaseDateHelp = $(By.xpath("//div[contains(@id,'characteristicsDatabase_date_help')]"));

    public static SelenideElement step3FillingCatalogEmloyeesFIO = $(By.xpath("//h3[contains(.,'наполнение каталога')]/parent::div/following-sibling::div//input[contains(@id,'fio')]"));
    public static SelenideElement step3FillingCatalogEmloyeesFIOHelp = $(By.xpath("//h3[contains(.,'наполнение каталога')]/parent::div/following-sibling::div//div[contains(@id, 'fio_help')]"));
    public static SelenideElement step3FillingCatalogEmloyeesLine2FIO = $(By.xpath("//h3[contains(.,'наполнение каталога')]/parent::div/following-sibling::div//tbody/tr[3]//input[contains(@id,'fio')]"));
    public static SelenideElement step3FillingCatalogEmloyeesFIOHelpLine2 = $(By.xpath("//h3[contains(.,'наполнение каталога')]/parent::div/following-sibling::div//tbody/tr[3]//div[contains(@id,'fio_help')]"));
    public static SelenideElement step3FillingCatalogEmloyeesFIOHelpLine3 = $(By.xpath("//h3[contains(.,'наполнение каталога')]/parent::div/following-sibling::div//tbody/tr[4]//div[contains(@id,'fio_help')]"));
    public static SelenideElement step3FillingCatalogEmloyeesPosition = $(By.xpath("//h3[contains(.,'наполнение каталога')]/parent::div/following-sibling::div//input[contains(@id,'position')]"));
    public static SelenideElement step3FillingCatalogEmloyeesPositionHelp = $(By.xpath("//h3[contains(.,'наполнение каталога')]/parent::div/following-sibling::div//div[contains(@id, 'position_help')]"));
    public static SelenideElement step3FillingCatalogEmloyeesLine2Position = $(By.xpath("//h3[contains(.,'наполнение каталога')]/parent::div/following-sibling::div//tbody/tr[3]//input[contains(@id,'position')]"));
    public static SelenideElement step3FillingCatalogEmloyeesPositionHelpLine2 = $(By.xpath("//h3[contains(.,'наполнение каталога')]/parent::div/following-sibling::div//tbody/tr[3]//div[contains(@id,'position_help')]"));
    public static SelenideElement step3FillingCatalogEmloyeesPositionHelpLine3 = $(By.xpath("//h3[contains(.,'наполнение каталога')]/parent::div/following-sibling::div//tbody/tr[4]//div[contains(@id,'position_help')]"));
    public static SelenideElement step3FillingCatalogEmloyeesPhoneOrEmail = $(By.xpath("//h3[contains(.,'наполнение каталога')]/parent::div/following-sibling::div//input[contains(@id,'phoneOrEmail')]"));
    public static SelenideElement step3FillingCatalogEmloyeesPhoneOrEmailHelp = $(By.xpath("//h3[contains(.,'наполнение каталога')]/parent::div/following-sibling::div//div[contains(@id, 'phoneOrEmail_help')]"));
    public static SelenideElement step3FillingCatalogEmloyeesLine2PhoneOrEmail = $(By.xpath("//h3[contains(.,'наполнение каталога')]/parent::div/following-sibling::div//tbody/tr[3]//input[contains(@id,'phoneOrEmail')]"));
    public static SelenideElement step3FillingCatalogEmloyeesPhoneOrEmailHelpLine2 = $(By.xpath("//h3[contains(.,'наполнение каталога')]/parent::div/following-sibling::div//tbody/tr[3]//div[contains(@id,'phoneOrEmail_help')]"));
    public static SelenideElement step3FillingCatalogEmloyeesPhoneOrEmailHelpLine3 = $(By.xpath("//h3[contains(.,'наполнение каталога')]/parent::div/following-sibling::div//tbody/tr[4]//div[contains(@id,'phoneOrEmail_help')]"));
    public static SelenideElement step3FillingCatalogEmloyeesButtonDeleteLine2 = $(By.xpath("//h3[contains(.,'наполнение каталога')]/parent::div/following-sibling::div//tbody/tr[3]//button[contains(.,'Удалить')]"));
    public static SelenideElement step3FillingCatalogEmloyeesButtonDeleteLine3 = $(By.xpath("//h3[contains(.,'наполнение каталога')]/parent::div/following-sibling::div//tbody/tr[4]//button[contains(.,'Удалить')]"));

    public static SelenideElement step3FillingCatalogButtonAddEmployee = $(By.xpath("//h3[contains(.,'наполнение каталога')]/parent::div//following-sibling::div[@class='ant-table-footer']/button[contains(.,'Добавить строку')]"));

    //таблица EDI-обмен
    public static SelenideElement electronicArrivalTransferSelectStep3 = $(By.xpath("//tr[contains(@data-row-key,'electronicArrival')]/td[2]//div[contains(@class,'ant-select-outlined')]"));
    public static SelenideElement electronicArrivalTransferListStep3 = $(By.xpath("//input[contains(@id,'electronicExchange_listMessages_electronicArrival_transfer')]"));
    public static SelenideElement electronicArrivalTransferVariantStep3 = $(By.xpath("//div[contains(@id,'electronicArrival_transfer_list')][@role='listbox']/following-sibling::div//div[@class='rc-virtual-list-holder-inner']/div[contains(@class,'item-option-active')]/div"));
    public static SelenideElement step3ElectronicArrivalTransferHelp = $(By.xpath("//div[contains(@id,'electronicArrival_transfer_help')]"));

    public static SelenideElement electronicArrivalStartDateInputStep3 = $(By.xpath("//input[contains(@id,'electronicArrival_startDate')]"));
    public static SelenideElement electronicArrivalStartDatePickerStep3 = $(By.xpath("//input[contains(@id,'electronicArrival_startDate')]/parent::div/parent::div"));
    public static SelenideElement step3ElectronicArrivalStartDateHelp = $(By.xpath("//div[contains(@id,'electronicArrival_startDate_help')]"));

    public static SelenideElement electronicArrivalLaunchDateInputStep3 = $(By.xpath("//input[contains(@id,'electronicArrival_launchDate')]"));
    public static SelenideElement electronicArrivalLaunchDatePickerStep3 = $(By.xpath("//input[contains(@id,'electronicArrival_launchDate')]/parent::div/parent::div"));
    public static SelenideElement step3ElectronicArrivalLaunchDateHelp = $(By.xpath("//div[contains(@id,'electronicArrival_launchDate_help')]"));

    public static SelenideElement electronicOrderTransferSelectStep3 = $(By.xpath("//tr[contains(@data-row-key,'electronicOrder')]/td[2]//div[contains(@class,'ant-select-outlined')]"));
    public static SelenideElement electronicOrderTransferListStep3 = $(By.xpath("//input[contains(@id,'electronicExchange_listMessages_electronicOrder_transfer')]"));
    public static SelenideElement electronicOrderTransferVariantStep3 = $(By.xpath("//div[contains(@id,'electronicOrder_transfer_list')][@role='listbox']/following-sibling::div//div[@class='rc-virtual-list-holder-inner']/div[contains(@class,'item-option-active')]/div"));
    public static SelenideElement step3ElectronicOrderTransferHelp = $(By.xpath("//div[contains(@id,'electronicOrder_transfer_help')]"));

    public static SelenideElement electronicOrderStartDateInputStep3 = $(By.xpath("//input[contains(@id,'electronicOrder_startDate')]"));
    public static SelenideElement electronicOrderStartDatePickerStep3 = $(By.xpath("//input[contains(@id,'electronicOrder_startDate')]/parent::div/parent::div"));
    public static SelenideElement step3ElectronicOrderStartDateHelp = $(By.xpath("//div[contains(@id,'electronicOrder_startDate_help')]"));

    public static SelenideElement electronicOrderLaunchDateInputStep3 = $(By.xpath("//input[contains(@id,'electronicOrder_launchDate')]"));
    public static SelenideElement electronicOrderLaunchDatePickerStep3 = $(By.xpath("//input[contains(@id,'electronicOrder_launchDate')]/parent::div/parent::div"));
    public static SelenideElement step3ElectronicOrderLaunchDateHelp = $(By.xpath("//div[contains(@id,'electronicOrder_launchDate_help')]"));

    public static SelenideElement confirmOrderTransferSelectStep3 = $(By.xpath("//tr[contains(@data-row-key,'confirmOrder')]/td[2]//div[contains(@class,'ant-select-outlined')]"));
    public static SelenideElement confirmOrderTransferListStep3 = $(By.xpath("//input[contains(@id,'electronicExchange_listMessages_confirmOrder_transfer')]"));
    public static SelenideElement confirmOrderTransferVariantStep3 = $(By.xpath("//div[contains(@id,'confirmOrder_transfer_list')][@role='listbox']/following-sibling::div//div[@class='rc-virtual-list-holder-inner']/div[contains(@class,'item-option-active')]/div"));
    public static SelenideElement step3ConfirmOrderTransferHelp = $(By.xpath("//div[contains(@id,'confirmOrder_transfer_help')]"));

    public static SelenideElement confirmOrderStartDateInputStep3 = $(By.xpath("//input[contains(@id,'confirmOrder_startDate')]"));
    public static SelenideElement confirmOrderStartDatePickerStep3 = $(By.xpath("//input[contains(@id,'confirmOrder_startDate')]/parent::div/parent::div"));
    public static SelenideElement step3ConfirmOrderStartDateHelp = $(By.xpath("//div[contains(@id,'confirmOrder_startDate_help')]"));

    public static SelenideElement confirmOrderLaunchDateInputStep3 = $(By.xpath("//input[contains(@id,'confirmOrder_launchDate')]"));
    public static SelenideElement confirmOrderLaunchDatePickerStep3 = $(By.xpath("//input[contains(@id,'confirmOrder_launchDate')]/parent::div/parent::div"));
    public static SelenideElement step3ConfirmOrderLaunchDateHelp = $(By.xpath("//div[contains(@id,'confirmOrder_launchDate_help')]"));

    public static SelenideElement nomenclatureFileRemainsTransferSelectStep3 = $(By.xpath("//tr[contains(@data-row-key,'nomenclatureFileRemains')]/td[2]//div[contains(@class,'ant-select-outlined')]"));
    public static SelenideElement nomenclatureFileRemainsTransferListStep3 = $(By.xpath("//input[contains(@id,'electronicExchange_listMessages_nomenclatureFileRemains_transfer')]"));
    public static SelenideElement nomenclatureFileRemainsTransferVariantStep3 = $(By.xpath("//div[contains(@id,'nomenclatureFileRemains_transfer_list')][@role='listbox']/following-sibling::div//div[@class='rc-virtual-list-holder-inner']/div[contains(@class,'item-option-active')]/div"));
    public static SelenideElement step3NomenclatureFileRemainsTransferHelp = $(By.xpath("//div[contains(@id,'nomenclatureFileRemains_transfer_help')]"));

    public static SelenideElement nomenclatureFileRemainsStartDateInputStep3 = $(By.xpath("//input[contains(@id,'nomenclatureFileRemains_startDate')]"));
    public static SelenideElement nomenclatureFileRemainsStartDatePickerStep3 = $(By.xpath("//input[contains(@id,'nomenclatureFileRemains_startDate')]/parent::div/parent::div"));
    public static SelenideElement step3NomenclatureFileRemainsStartDateHelp = $(By.xpath("//div[contains(@id,'nomenclatureFileRemains_startDate_help')]"));

    public static SelenideElement nomenclatureFileRemainsLaunchDateInputStep3 = $(By.xpath("//input[contains(@id,'nomenclatureFileRemains_launchDate')]"));
    public static SelenideElement nomenclatureFileRemainsLaunchDatePickerStep3 = $(By.xpath("//input[contains(@id,'nomenclatureFileRemains_launchDate')]/parent::div/parent::div"));
    public static SelenideElement step3NomenclatureFileRemainsLaunchDateHelp = $(By.xpath("//div[contains(@id,'nomenclatureFileRemains_launchDate_help')]"));

    public static SelenideElement nomenclatureFilePriceTransferSelectStep3 = $(By.xpath("//tr[contains(@data-row-key,'nomenclatureFilePrice')]/td[2]//div[contains(@class,'ant-select-outlined')]"));
    public static SelenideElement nomenclatureFilePriceTransferListStep3 = $(By.xpath("//input[contains(@id,'electronicExchange_listMessages_nomenclatureFilePrice_transfer')]"));
    public static SelenideElement nomenclatureFilePriceTransferVariantStep3 = $(By.xpath("//div[contains(@id,'nomenclatureFilePrice_transfer_list')][@role='listbox']/following-sibling::div//div[@class='rc-virtual-list-holder-inner']/div[contains(@class,'item-option-active')]/div"));
    public static SelenideElement step3NomenclatureFilePriceTransferHelp = $(By.xpath("//div[contains(@id,'nomenclatureFilePrice_transfer_help')]"));

    public static SelenideElement nomenclatureFilePriceStartDateInputStep3 = $(By.xpath("//input[contains(@id,'nomenclatureFilePrice_startDate')]"));
    public static SelenideElement nomenclatureFilePriceStartDatePickerStep3 = $(By.xpath("//input[contains(@id,'nomenclatureFilePrice_startDate')]/parent::div/parent::div"));
    public static SelenideElement step3NomenclatureFilePriceStartDateHelp = $(By.xpath("//div[contains(@id,'nomenclatureFilePrice_startDate_help')]"));

    public static SelenideElement nomenclatureFilePriceLaunchDateInputStep3 = $(By.xpath("//input[contains(@id,'nomenclatureFilePrice_launchDate')]"));
    public static SelenideElement nomenclatureFilePriceLaunchDatePickerStep3 = $(By.xpath("//input[contains(@id,'nomenclatureFilePrice_launchDate')]/parent::div/parent::div"));
    public static SelenideElement step3NomenclatureFilePriceLaunchDateHelp = $(By.xpath("//div[contains(@id,'nomenclatureFilePrice_launchDate_help')]"));

    public static SelenideElement estimatedDeliveryTransferSelectStep3 = $(By.xpath("//tr[contains(@data-row-key,'estimatedDelivery')]/td[2]//div[contains(@class,'ant-select-outlined')]"));
    public static SelenideElement estimatedDeliveryTransferListStep3 = $(By.xpath("//input[contains(@id,'electronicExchange_listMessages_estimatedDelivery_transfer')]"));
    public static SelenideElement estimatedDeliveryTransferVariantStep3 = $(By.xpath("//div[contains(@id,'estimatedDelivery_transfer_list')][@role='listbox']/following-sibling::div//div[@class='rc-virtual-list-holder-inner']/div[contains(@class,'item-option-active')]/div"));
    public static SelenideElement step3EstimatedDeliveryTransferHelp = $(By.xpath("//div[contains(@id,'estimatedDelivery_transfer_help')]"));

    public static SelenideElement estimatedDeliveryStartDateInputStep3 = $(By.xpath("//input[contains(@id,'estimatedDelivery_startDate')]"));
    public static SelenideElement estimatedDeliveryStartDatePickerStep3 = $(By.xpath("//input[contains(@id,'estimatedDelivery_startDate')]/parent::div/parent::div"));
    public static SelenideElement step3EstimatedDeliveryStartDateHelp = $(By.xpath("//div[contains(@id,'estimatedDelivery_startDate_help')]"));

    public static SelenideElement estimatedDeliveryLaunchDateInputStep3 = $(By.xpath("//input[contains(@id,'estimatedDelivery_launchDate')]"));
    public static SelenideElement estimatedDeliveryLaunchDatePickerStep3 = $(By.xpath("//input[contains(@id,'estimatedDelivery_launchDate')]/parent::div/parent::div"));
    public static SelenideElement step3EstimatedDeliveryLaunchDateHelp = $(By.xpath("//div[contains(@id,'estimatedDelivery_launchDate_help')]"));

    public static SelenideElement specialConditionsTransferSelectStep3 = $(By.xpath("//tr[contains(@data-row-key,'specialConditions')]/td[2]//div[contains(@class,'ant-select-outlined')]"));
    public static SelenideElement specialConditionsTransferListStep3 = $(By.xpath("//input[contains(@id,'electronicExchange_listMessages_specialConditions_transfer')]"));
    public static SelenideElement specialConditionsTransferVariantStep3 = $(By.xpath("//div[contains(@id,'specialConditions_transfer_list')][@role='listbox']/following-sibling::div//div[@class='rc-virtual-list-holder-inner']/div[contains(@class,'item-option-active')]/div"));
    public static SelenideElement step3SpecialConditionsTransferHelp = $(By.xpath("//div[contains(@id,'specialConditions_transfer_help')]"));

    public static SelenideElement specialConditionsStartDateInputStep3 = $(By.xpath("//input[contains(@id,'specialConditions_startDate')]"));
    public static SelenideElement specialConditionsStartDatePickerStep3 = $(By.xpath("//input[contains(@id,'specialConditions_startDate')]/parent::div/parent::div"));
    public static SelenideElement step3SpecialConditionsStartDateHelp = $(By.xpath("//div[contains(@id,'specialConditions_startDate_help')]"));

    public static SelenideElement specialConditionsLaunchDateInputStep3 = $(By.xpath("//input[contains(@id,'specialConditions_launchDate')]"));
    public static SelenideElement specialConditionsLaunchDatePickerStep3 = $(By.xpath("//input[contains(@id,'specialConditions_launchDate')]/parent::div/parent::div"));
    public static SelenideElement step3SpecialConditionsLaunchDateHelp = $(By.xpath("//div[contains(@id,'specialConditions_launchDate_help')]"));

    public static SelenideElement nomenclatureFileCharacteristicsTransferSelectStep3 = $(By.xpath("//tr[contains(@data-row-key,'nomenclatureFileCharacteristics')]/td[2]//div[contains(@class,'ant-select-outlined')]"));
    public static SelenideElement nomenclatureFileCharacteristicsTransferListStep3 = $(By.xpath("//input[contains(@id,'electronicExchange_listMessages_nomenclatureFileCharacteristics_transfer')]"));
    public static SelenideElement nomenclatureFileCharacteristicsTransferVariantStep3 = $(By.xpath("//div[contains(@id,'nomenclatureFileCharacteristics_transfer_list')][@role='listbox']/following-sibling::div//div[@class='rc-virtual-list-holder-inner']/div[contains(@class,'item-option-active')]/div"));
    public static SelenideElement step3NomenclatureFileCharacteristicsTransferHelp = $(By.xpath("//div[contains(@id,'nomenclatureFileCharacteristics_transfer_help')]"));

    public static SelenideElement nomenclatureFileCharacteristicsStartDateInputStep3 = $(By.xpath("//input[contains(@id,'nomenclatureFileCharacteristics_startDate')]"));
    public static SelenideElement nomenclatureFileCharacteristicsStartDatePickerStep3 = $(By.xpath("//input[contains(@id,'nomenclatureFileCharacteristics_startDate')]/parent::div/parent::div"));
    public static SelenideElement step3NomenclatureFileCharacteristicsStartDateHelp = $(By.xpath("//div[contains(@id,'nomenclatureFileCharacteristics_startDate_help')]"));

    public static SelenideElement nomenclatureFileCharacteristicsLaunchDateInputStep3 = $(By.xpath("//input[contains(@id,'nomenclatureFileCharacteristics_launchDate')]"));
    public static SelenideElement nomenclatureFileCharacteristicsLaunchDatePickerStep3 = $(By.xpath("//input[contains(@id,'nomenclatureFileCharacteristics_launchDate')]/parent::div/parent::div"));
    public static SelenideElement step3NomenclatureFileCharacteristicsLaunchDateHelp = $(By.xpath("//div[contains(@id,'nomenclatureFileCharacteristics_launchDate_help')]"));


    public static SelenideElement step3FillingEDIExchangeEmloyeesFIO = $(By.xpath("//h3[contains(.,'EDI-обмен')]/parent::div/following-sibling::div//input[contains(@id,'fio')]"));
    public static SelenideElement step3FillingEDIExchangeEmloyeesFIOHelp = $(By.xpath("//h3[contains(.,'EDI-обмен')]/parent::div/following-sibling::div//div[contains(@id, 'fio_help')]"));
    public static SelenideElement step3FillingEDIExchangeEmloyeesLine2FIO = $(By.xpath("//h3[contains(.,'EDI-обмен')]/parent::div/following-sibling::div//tbody/tr[3]//input[contains(@id,'fio')]"));
    public static SelenideElement step3FillingEDIExchangeEmloyeesFIOHelpLine2 = $(By.xpath("//h3[contains(.,'EDI-обмен')]/parent::div/following-sibling::div//tbody/tr[3]//div[contains(@id,'fio_help')]"));
    public static SelenideElement step3FillingEDIExchangeEmloyeesFIOHelpLine3 = $(By.xpath("//h3[contains(.,'EDI-обмен')]/parent::div/following-sibling::div//tbody/tr[4]//div[contains(@id,'fio_help')]"));
    public static SelenideElement step3FillingEDIExchangeEmloyeesPosition = $(By.xpath("//h3[contains(.,'EDI-обмен')]/parent::div/following-sibling::div//input[contains(@id,'position')]"));
    public static SelenideElement step3FillingEDIExchangeEmloyeesPositionHelp = $(By.xpath("//h3[contains(.,'EDI-обмен')]/parent::div/following-sibling::div//div[contains(@id, 'position_help')]"));
    public static SelenideElement step3FillingEDIExchangeEmloyeesLine2Position = $(By.xpath("//h3[contains(.,'EDI-обмен')]/parent::div/following-sibling::div//tbody/tr[3]//input[contains(@id,'position')]"));
    public static SelenideElement step3FillingEDIExchangeEmloyeesPositionHelpLine2 = $(By.xpath("//h3[contains(.,'EDI-обмен')]/parent::div/following-sibling::div//tbody/tr[3]//div[contains(@id,'position_help')]"));
    public static SelenideElement step3FillingEDIExchangeEmloyeesPositionHelpLine3 = $(By.xpath("//h3[contains(.,'EDI-обмен')]/parent::div/following-sibling::div//tbody/tr[4]//div[contains(@id,'position_help')]"));
    public static SelenideElement step3FillingEDIExchangeEmloyeesPhoneOrEmail = $(By.xpath("//h3[contains(.,'EDI-обмен')]/parent::div/following-sibling::div//input[contains(@id,'phoneOrEmail')]"));
    public static SelenideElement step3FillingEDIExchangeEmloyeesPhoneOrEmailHelp = $(By.xpath("//h3[contains(.,'EDI-обмен')]/parent::div/following-sibling::div//div[contains(@id, 'phoneOrEmail_help')]"));
    public static SelenideElement step3FillingEDIExchangeEmloyeesLine2PhoneOrEmail = $(By.xpath("//h3[contains(.,'EDI-обмен')]/parent::div/following-sibling::div//tbody/tr[3]//input[contains(@id,'phoneOrEmail')]"));
    public static SelenideElement step3FillingEDIExchangeEmloyeesPhoneOrEmailHelpLine2 = $(By.xpath("//h3[contains(.,'EDI-обмен')]/parent::div/following-sibling::div//tbody/tr[3]//div[contains(@id,'phoneOrEmail_help')]"));
    public static SelenideElement step3FillingEDIExchangeEmloyeesPhoneOrEmailHelpLine3 = $(By.xpath("//h3[contains(.,'EDI-обмен')]/parent::div/following-sibling::div//tbody/tr[4]//div[contains(@id,'phoneOrEmail_help')]"));
    public static SelenideElement step3FillingEDIExchangeEmloyeesButtonDeleteLine2 = $(By.xpath("//h3[contains(.,'EDI-обмен')]/parent::div/following-sibling::div//tbody/tr[3]//button[contains(.,'Удалить')]"));
    public static SelenideElement step3FillingEDIExchangeEmloyeesButtonDeleteLine3 = $(By.xpath("//h3[contains(.,'EDI-обмен')]/parent::div/following-sibling::div//tbody/tr[4]//button[contains(.,'Удалить')]"));
    public static SelenideElement step3EDIExchangeButtonAddEmployee = $(By.xpath("//h3[contains(.,'EDI-обмен')]/parent::div//following-sibling::div[@class='ant-table-footer']/button[contains(.,'Добавить строку')]"));

    //таблица организация ЮЗЭДО

    public static SelenideElement updStartDateUZEDODateInputStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_upd_startDate')]"));
    public static SelenideElement updStartDateUZEDOPickerStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_upd_startDate')]/parent::div/parent::div"));
    public static SelenideElement step3UPDStartDateHelp = $(By.xpath("//div[contains(@id,'uzedoTerm_upd_startDate_help')]"));

    public static SelenideElement updLaunchDateUZEDODateInputStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_upd_launchDate')]"));
    public static SelenideElement updLaunchDateUZEDOPickerStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_upd_launchDate')]/parent::div/parent::div"));
    public static SelenideElement step3UPDLaunchDateDateHelp = $(By.xpath("//div[contains(@id,'uzedoTerm_upd_launchDate_help')]"));

    public static SelenideElement actServicesStartDateUZEDODateInputStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_actServices_startDate')]"));
    public static SelenideElement actServicesStartDateUZEDOPickerStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_actServices_startDate')]/parent::div/parent::div"));
    public static SelenideElement step3ActServicesStartDateHelp = $(By.xpath("//div[contains(@id,'uzedoTerm_actServices_startDate_help')]"));

    public static SelenideElement actServicesLaunchDateUZEDODateInputStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_actServices_launchDate')]"));
    public static SelenideElement actServicesLaunchDateUZEDOPickerStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_actServices_launchDate')]/parent::div/parent::div"));
    public static SelenideElement step3ActServicesLaunchDateDateHelp = $(By.xpath("//div[contains(@id,'uzedoTerm_actServices_launchDate_help')]"));

    public static SelenideElement ukdStartDateUZEDODateInputStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_ukd_startDate')]"));
    public static SelenideElement ukdStartDateUZEDOPickerStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_ukd_startDate')]/parent::div/parent::div"));
    public static SelenideElement step3UKDStartDateHelp = $(By.xpath("//div[contains(@id,'uzedoTerm_ukd_startDate_help')]"));

    public static SelenideElement ukdLaunchDateUZEDODateInputStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_ukd_launchDate')]"));
    public static SelenideElement ukdLaunchDateUZEDOPickerStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_ukd_launchDate')]/parent::div/parent::div"));
    public static SelenideElement step3UKDLaunchDateHelp = $(By.xpath("//div[contains(@id,'uzedoTerm_ukd_launchDate_help')]"));

    public static SelenideElement additionalAgreementsStartDateUZEDODateInputStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_additionalAgreements_startDate')]"));
    public static SelenideElement additionalAgreementsStartDateUZEDOPickerStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_additionalAgreements_startDate')]/parent::div/parent::div"));
    public static SelenideElement step3AdditionalAgreementsStartDateHelp = $(By.xpath("//div[contains(@id,'uzedoTerm_additionalAgreements_startDate_help')]"));

    public static SelenideElement additionalAgreementsLaunchDateUZEDODateInputStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_additionalAgreements_launchDate')]"));
    public static SelenideElement additionalAgreementsLaunchDateUZEDOPickerStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_additionalAgreements_launchDate')]/parent::div/parent::div"));
    public static SelenideElement step3AdditionalAgreementsLaunchDateDateHelp = $(By.xpath("//div[contains(@id,'uzedoTerm_additionalAgreements_launchDate_help')]"));

    public static SelenideElement specificationStartDateUZEDODateInputStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_specification_startDate')]"));
    public static SelenideElement specificationStartDateUZEDOPickerStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_specification_startDate')]/parent::div/parent::div"));
    public static SelenideElement step3SpecificationStartDateHelp = $(By.xpath("//div[contains(@id,'uzedoTerm_specification_startDate_help')]"));

    public static SelenideElement specificationLaunchDateUZEDODateInputStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_specification_launchDate')]"));
    public static SelenideElement specificationLaunchDateUZEDOPickerStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_specification_launchDate')]/parent::div/parent::div"));
    public static SelenideElement step3SpecificationLaunchDateHelp = $(By.xpath("//div[contains(@id,'uzedoTerm_specification_launchDate_help')]"));

    public static SelenideElement powersAttorneyStartDateUZEDODateInputStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_powersAttorney_startDate')]"));
    public static SelenideElement powersAttorneyStartDateUZEDOPickerStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_powersAttorney_startDate')]/parent::div/parent::div"));
    public static SelenideElement step3PowersAttorneyStartDateHelp = $(By.xpath("//div[contains(@id,'uzedoTerm_powersAttorney_startDate_help')]"));

    public static SelenideElement powersAttorneyLaunchDateUZEDODateInputStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_powersAttorney_launchDate')]"));
    public static SelenideElement powersAttorneyLaunchDateUZEDOPickerStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_powersAttorney_launchDate')]/parent::div/parent::div"));
    public static SelenideElement step3PowersAttorneyLaunchDateDateHelp = $(By.xpath("//div[contains(@id,'uzedoTerm_powersAttorney_launchDate_help')]"));

    public static SelenideElement actReconciliationStartDateUZEDODateInputStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_actReconciliation_startDate')]"));
    public static SelenideElement actReconciliationStartDateUZEDOPickerStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_actReconciliation_startDate')]/parent::div/parent::div"));
    public static SelenideElement step3ActReconciliationStartDateHelp = $(By.xpath("//div[contains(@id,'uzedoTerm_actReconciliation_startDate_help')]"));

    public static SelenideElement actReconciliationLaunchDateUZEDODateInputStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_actReconciliation_launchDate')]"));
    public static SelenideElement actReconciliationLaunchDateUZEDOPickerStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_actReconciliation_launchDate')]/parent::div/parent::div"));
    public static SelenideElement step3ActReconciliationLaunchDateHelp = $(By.xpath("//div[contains(@id,'uzedoTerm_actReconciliation_launchDate_help')]"));

    public static SelenideElement actReportStartDateUZEDODateInputStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_actReport_startDate')]"));
    public static SelenideElement actReportStartDateUZEDOPickerStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_actReport_startDate')]/parent::div/parent::div"));
    public static SelenideElement step3ActReportStartDateHelp = $(By.xpath("//div[contains(@id,'uzedoTerm_actReport_startDate_help')]"));

    public static SelenideElement actReportLaunchDateUZEDODateInputStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_actReport_launchDate')]"));
    public static SelenideElement actReportLaunchDateUZEDOPickerStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_actReport_launchDate')]/parent::div/parent::div"));
    public static SelenideElement step3ActReportLaunchDateHelp = $(By.xpath("//div[contains(@id,'uzedoTerm_actReport_launchDate_help')]"));

    public static SelenideElement actDiscrepancyStartDateUZEDODateInputStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_actDiscrepancy_startDate')]"));
    public static SelenideElement actDiscrepancyStartDateUZEDOPickerStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_actDiscrepancy_startDate')]/parent::div/parent::div"));
    public static SelenideElement step3ActDiscrepancyStartDateHelp = $(By.xpath("//div[contains(@id,'uzedoTerm_actDiscrepancy_startDate_help')]"));

    public static SelenideElement actDiscrepancyLaunchDateUZEDODateInputStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_actDiscrepancy_launchDate')]"));
    public static SelenideElement actDiscrepancyLaunchDateUZEDOPickerStep3 = $(By.xpath("//input[contains(@id,'uzedoTerm_actDiscrepancy_launchDate')]/parent::div/parent::div"));
    public static SelenideElement step3ActDiscrepancyLaunchDateHelp = $(By.xpath("//div[contains(@id,'uzedoTerm_actDiscrepancy_launchDate_help')]"));

    public static SelenideElement step3FillingUZEDOEmloyeesFIO = $(By.xpath("//h3[contains(.,'ЮЗЭДО')]/parent::div/following-sibling::div//input[contains(@id,'fio')]"));
    public static SelenideElement step3FillingUZEDOEmloyeesFIOHelp = $(By.xpath("//h3[contains(.,'ЮЗЭДО')]/parent::div/following-sibling::div//div[contains(@id, 'fio_help')]"));
    public static SelenideElement step3FillingUZEDOEmloyeesLine2FIO = $(By.xpath("//h3[contains(.,'ЮЗЭДО')]/parent::div/following-sibling::div//tbody/tr[3]//input[contains(@id,'fio')]"));
    public static SelenideElement step3FillingUZEDOEmloyeesFIOHelpLine2 = $(By.xpath("//h3[contains(.,'ЮЗЭДО')]/parent::div/following-sibling::div//tbody/tr[3]//div[contains(@id,'fio_help')]"));
    public static SelenideElement step3FillingUZEDOEmloyeesFIOHelpLine3 = $(By.xpath("//h3[contains(.,'ЮЗЭДО')]/parent::div/following-sibling::div//tbody/tr[4]//div[contains(@id,'fio_help')]"));
    public static SelenideElement step3FillingUZEDOEmloyeesPosition = $(By.xpath("//h3[contains(.,'ЮЗЭДО')]/parent::div/following-sibling::div//input[contains(@id,'position')]"));
    public static SelenideElement step3FillingUZEDOEmloyeesPositionHelp = $(By.xpath("//h3[contains(.,'ЮЗЭДО')]/parent::div/following-sibling::div//div[contains(@id, 'position_help')]"));
    public static SelenideElement step3FillingUZEDOEmloyeesLine2Position = $(By.xpath("//h3[contains(.,'ЮЗЭДО')]/parent::div/following-sibling::div//tbody/tr[3]//input[contains(@id,'position')]"));
    public static SelenideElement step3FillingUZEDOEmloyeesPositionHelpLine2 = $(By.xpath("//h3[contains(.,'ЮЗЭДО')]/parent::div/following-sibling::div//tbody/tr[3]//div[contains(@id,'position_help')]"));
    public static SelenideElement step3FillingUZEDOEmloyeesPositionHelpLine3 = $(By.xpath("//h3[contains(.,'ЮЗЭДО')]/parent::div/following-sibling::div//tbody/tr[4]//div[contains(@id,'position_help')]"));
    public static SelenideElement step3FillingUZEDOEmloyeesPhoneOrEmail = $(By.xpath("//h3[contains(.,'ЮЗЭДО')]/parent::div/following-sibling::div//input[contains(@id,'phoneOrEmail')]"));
    public static SelenideElement step3FillingUZEDOEmloyeesPhoneOrEmailHelp = $(By.xpath("//h3[contains(.,'ЮЗЭДО')]/parent::div/following-sibling::div//div[contains(@id, 'phoneOrEmail_help')]"));
    public static SelenideElement step3FillingUZEDOEmloyeesLine2PhoneOrEmail = $(By.xpath("//h3[contains(.,'ЮЗЭДО')]/parent::div/following-sibling::div//tbody/tr[3]//input[contains(@id,'phoneOrEmail')]"));
    public static SelenideElement step3FillingUZEDOEmloyeesPhoneOrEmailHelpLine2 = $(By.xpath("//h3[contains(.,'ЮЗЭДО')]/parent::div/following-sibling::div//tbody/tr[3]//div[contains(@id,'phoneOrEmail_help')]"));
    public static SelenideElement step3FillingUZEDOEmloyeesPhoneOrEmailHelpLine3 = $(By.xpath("//h3[contains(.,'ЮЗЭДО')]/parent::div/following-sibling::div//tbody/tr[4]//div[contains(@id,'phoneOrEmail_help')]"));
    public static SelenideElement step3FillingUZEDOEmloyeesButtonDeleteLine2 = $(By.xpath("//h3[contains(.,'ЮЗЭДО')]/parent::div/following-sibling::div//tbody/tr[3]//button[contains(.,'Удалить')]"));
    public static SelenideElement step3FillingUZEDOEmloyeesButtonDeleteLine3 = $(By.xpath("//h3[contains(.,'ЮЗЭДО')]/parent::div/following-sibling::div//tbody/tr[4]//button[contains(.,'Удалить')]"));
    public static SelenideElement step3FillingUZEDOButtonAddEmployee = $(By.xpath("//h3[contains(.,'ЮЗЭДО')]/parent::div//following-sibling::div[@class='ant-table-footer']/button[contains(.,'Добавить строку')]"));

    public static SelenideElement startEndDatePublicationMaterialsPickerStep3 = $(By.xpath("//input[@id='informationInteraction_otherDirections_supplierStartDate']/parent::div/parent::div"));
    public static SelenideElement startEndDatePublicationMaterialsInputStep3 = $(By.xpath("//input[@id='informationInteraction_otherDirections_supplierStartDate']"));
    public static SelenideElement step3startEndDatePublicationMaterialsHelp = $(By.xpath("//div[contains(@id,'otherDirections_supplierStartDate_help')]"));

    public static SelenideElement step3PublicationMaterialsEmloyeesFIO = $(By.xpath("//h3[contains(.,'публикацию материалов')]/parent::div/following-sibling::div//input[contains(@id,'fio')]"));
    public static SelenideElement step3PublicationOfMaterialsEmloyeesFIOHelp = $(By.xpath("//h3[contains(.,'публикацию материалов')]/parent::div/following-sibling::div//div[contains(@id, 'fio_help')]"));
    public static SelenideElement step3PublicationOfMaterialsEmloyeesLine2FIO = $(By.xpath("//h3[contains(.,'публикацию материалов')]/parent::div/following-sibling::div//tbody/tr[3]//input[contains(@id,'fio')]"));
    public static SelenideElement step3PublicationOfMaterialsEmloyeesFIOHelpLine2 = $(By.xpath("//h3[contains(.,'публикацию материалов')]/parent::div/following-sibling::div//tbody/tr[3]//div[contains(@id,'fio_help')]"));
    public static SelenideElement step3PublicationOfMaterialsEmloyeesFIOHelpLine3 = $(By.xpath("//h3[contains(.,'публикацию материалов')]/parent::div/following-sibling::div//tbody/tr[4]//div[contains(@id,'fio_help')]"));
    public static SelenideElement step3PublicationMaterialsEmloyeesPosition = $(By.xpath("//h3[contains(.,'публикацию материалов')]/parent::div/following-sibling::div//input[contains(@id,'position')]"));
    public static SelenideElement step3PublicationOfMaterialsEmloyeesPositionHelp = $(By.xpath("//h3[contains(.,'публикацию материалов')]/parent::div/following-sibling::div//div[contains(@id, 'position_help')]"));
    public static SelenideElement step3PublicationOfMaterialsEmloyeesLine2Position = $(By.xpath("//h3[contains(.,'публикацию материалов')]/parent::div/following-sibling::div//tbody/tr[3]//input[contains(@id,'position')]"));
    public static SelenideElement step3PublicationOfMaterialsEmloyeesPositionHelpLine2 = $(By.xpath("//h3[contains(.,'публикацию материалов')]/parent::div/following-sibling::div//tbody/tr[3]//div[contains(@id,'position_help')]"));
    public static SelenideElement step3PublicationOfMaterialsEmloyeesPositionHelpLine3 = $(By.xpath("//h3[contains(.,'публикацию материалов')]/parent::div/following-sibling::div//tbody/tr[4]//div[contains(@id,'position_help')]"));
    public static SelenideElement step3PublicationMaterialsEmloyeesPhoneOrEmail = $(By.xpath("//h3[contains(.,'публикацию материалов')]/parent::div/following-sibling::div//input[contains(@id,'phoneOrEmail')]"));
    public static SelenideElement step3PublicationOfMaterialsEmloyeesPhoneOrEmailHelp = $(By.xpath("//h3[contains(.,'публикацию материалов')]/parent::div/following-sibling::div//div[contains(@id, 'phoneOrEmail_help')]"));
    public static SelenideElement step3PublicationOfMaterialsEmloyeesLine2PhoneOrEmail = $(By.xpath("//h3[contains(.,'публикацию материалов')]/parent::div/following-sibling::div//tbody/tr[3]//input[contains(@id,'phoneOrEmail')]"));
    public static SelenideElement step3PublicationOfMaterialsEmloyeesPhoneOrEmailHelpLine2 = $(By.xpath("//h3[contains(.,'публикацию материалов')]/parent::div/following-sibling::div//tbody/tr[3]//div[contains(@id,'phoneOrEmail_help')]"));
    public static SelenideElement step3PublicationOfMaterialsEmloyeesPhoneOrEmailHelpLine3 = $(By.xpath("//h3[contains(.,'публикацию материалов')]/parent::div/following-sibling::div//tbody/tr[4]//div[contains(@id,'phoneOrEmail_help')]"));
    public static SelenideElement step3PublicationOfMaterialsEmloyeesButtonDeleteLine2 = $(By.xpath("//h3[contains(.,'публикацию материалов')]/parent::div/following-sibling::div//tbody/tr[3]//button[contains(.,'Удалить')]"));
    public static SelenideElement step3PublicationOfMaterialsEmloyeesButtonDeleteLine3 = $(By.xpath("//h3[contains(.,'публикацию материалов')]/parent::div/following-sibling::div//tbody/tr[4]//button[contains(.,'Удалить')]"));
    public static SelenideElement step3PublicationOfMaterialsButtonAddEmployee = $(By.xpath("//h3[contains(.,'публикацию материалов')]/parent::div//following-sibling::div[@class='ant-table-footer']/button[contains(.,'Добавить строку')]"));

    //Элементы Шага 4
    public static SelenideElement step4subtitle1 = $(By.xpath("//h3[contains(., 'Договор')]"));
    public static SelenideElement step4unit1 = $(By.xpath("//h3[contains(., 'Договор')]/parent::span/parent::div/parent::div"));
    public static SelenideElement uploadContractStep4 =$(By.xpath("//input[@id='uploadingDocuments_contract']"));
    public static SelenideElement buttonDeleteFileContractStep4 =$(By.xpath("//input[@id='uploadingDocuments_contract']/parent::span/parent::div/following-sibling::div//button[@title='Удалить файл']"));
    public static SelenideElement uploadContractHelpStep4 = $("#uploadingDocuments_contract_help");
    public static SelenideElement step4subtitle2 = $(By.xpath("//h3[contains(., 'Устав')]"));
    public static SelenideElement step4unit2 = $(By.xpath("//h3[contains(., 'Устав')]/parent::span/parent::div/parent::div"));
    public static SelenideElement uploadRegulationsStep4 = $(By.xpath(" //input[@id='uploadingDocuments_regulations']"));
    public static SelenideElement buttonDeleteFileRegulationsStep4 =$(By.xpath("//input[@id='uploadingDocuments_regulations']/parent::span/parent::div/following-sibling::div//button[@title='Удалить файл']"));
    public static SelenideElement uploadRegulationsHelpStep4 = $("#uploadingDocuments_regulations_help");
    public static SelenideElement step4subtitle3 = $(By.xpath("//h3[contains(., 'Протокол/решение о назначении генерального директора')]"));
    public static SelenideElement step4unit3 = $(By.xpath("//h3[contains(., 'Протокол/решение о назначении генерального директора')]/parent::span/parent::div/parent::div"));
    public static SelenideElement uploadProtocolStep4 = $(By.xpath("//input[@id='uploadingDocuments_protocol']"));
    public static SelenideElement buttonDeleteFileProtocolStep4 =$(By.xpath("//input[@id='uploadingDocuments_protocol']/parent::span/parent::div/following-sibling::div//button[@title='Удалить файл']"));
    public static SelenideElement uploadProtocolHelpStep4 = $("#uploadingDocuments_protocol_help");
    public static SelenideElement step4subtitle4 = $(By.xpath("//h3[contains(., 'Документы на товарный знак')]"));
    public static SelenideElement step4unit4 = $(By.xpath("//h3[contains(., 'Документы на товарный знак')]/parent::span/parent::div/parent::div"));
    public static SelenideElement uploadTradeMarkStep4 = $(By.xpath("//input[@id='uploadingDocuments_tradeMark']"));
    public static SelenideElement buttonDeleteFileTradeMarkStep4 =$(By.xpath("//input[@id='uploadingDocuments_tradeMark']/parent::span/parent::div/following-sibling::div//button[@title='Удалить файл']"));
    public static SelenideElement uploadTradeMarkHelpStep4 = $("#uploadingDocuments_tradeMark_help");
    public static SelenideElement step4subtitle5 = $(By.xpath("//h3[contains(., 'Копия доверенности')]"));
    public static SelenideElement step4unit5 = $(By.xpath("//h3[contains(., 'Копия доверенности')]/parent::span/parent::div/parent::div"));
    public static SelenideElement uploadPowerOfAttorneyStep4 = $(By.xpath(" //input[@id='uploadingDocuments_powerOfAttorney']"));
    public static SelenideElement buttonDeleteFilePowerOfAttorneyStep4 =$(By.xpath("//input[@id='uploadingDocuments_powerOfAttorney']/parent::span/parent::div/following-sibling::div//button[@title='Удалить файл']"));
    public static SelenideElement uploadPowerOfAttorneyHelpStep4 = $("#uploadingDocuments_powerOfAttorney_help");
    public static SelenideElement step4subtitle6 = $(By.xpath("//h3[contains(., 'Декларация по УСН')]"));
    public static SelenideElement step4unit6 = $(By.xpath("//h3[contains(., 'Декларация по УСН')]/parent::span/parent::div/parent::div"));
    public static SelenideElement uploadDeclarationStep4 = $(By.xpath(" //input[@id='uploadingDocuments_declaration']"));
    public static SelenideElement buttonDeleteFileDeclarationStep4 =$(By.xpath("//input[@id='uploadingDocuments_declaration']/parent::span/parent::div/following-sibling::div//button[@title='Удалить файл']"));
    public static SelenideElement uploadDeclarationHelpStep4 = $("#uploadingDocuments_declaration_help");
    public static SelenideElement step4subtitle7 = $(By.xpath("//h3[contains(., 'Дополнительные документы')]"));
    public static SelenideElement step4unit7 = $(By.xpath("//h3[contains(., 'Дополнительные документы')]/parent::span/parent::div/parent::div"));
    public static SelenideElement uploadExtraDocsStep4 = $(By.xpath(" //input[@id='uploadingDocuments_extraDocs']"));
    public static SelenideElement buttonDeleteFileExtraDocsStep4 =$(By.xpath("//input[@id='uploadingDocuments_extraDocs']/parent::span/parent::div/following-sibling::div//button[@title='Удалить файл']"));
    public static SelenideElement uploadExtraDocsHelpStep4 = $("#uploadingDocuments_extraDocs_help");
    public static SelenideElement buttonBackStep4 = $(By.xpath("//button[contains(.,'Назад')]"));
    public static SelenideElement buttonSubmitStep4 = $(By.xpath("//button[contains(.,'Отправить договор')]"));

    public static SelenideElement successSendingContractTitle =$(By.xpath("//div[@class='ant-result-title']"));
    public static SelenideElement successSendingContractSubtitle =$(By.xpath("  //div[@class='ant-result-subtitle']"));

    //Степпер
    public static SelenideElement step0IsFinished = $(By.xpath("//div[contains(@class,'ant-steps')]/div[1][contains(@class,'finish' )]"));
    public static SelenideElement step0IsActive = $(By.xpath("//div[contains(@class,'ant-steps')]/div[1][contains(@class,'active' )]"));
    //public static SelenideElement step1IsFinished = $(By.xpath("//div[contains(@class,'ant-steps')]/div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'finish' )]"));
    public static SelenideElement step1IsActive = $(By.xpath("//div[contains(@class,'ant-steps')]/div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'active' )]"));
    public static SelenideElement step2IsActive =$(By.xpath("//div[contains(@class,'ant-steps')]/div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'active' )]"));
    //public static SelenideElement step2IsFinished = $(By.xpath("//div[contains(@class,'ant-steps')]/div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'finish' )]"));
    public static SelenideElement step3IsActive =$(By.xpath("//div[contains(@class,'ant-steps')]/div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'active' )]"));
    //public static SelenideElement step3IsFinished =$(By.xpath("//div[contains(@class,'ant-steps')]/div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'finish' )]"));
    public static SelenideElement step4IsActiveAfterStep3 =$(By.xpath("//div[contains(@class,'ant-steps')]/div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'active' )]"));
    public static SelenideElement step5IsActiveAfterFillingStep3 =$(By.xpath("//div[contains(@class,'ant-steps')]/div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'finish' )]/following-sibling::div[1][contains(@class,'active' )]"));
    public static SelenideElement step4ActiveFromStep0 = $(By.xpath("//div[contains(@class,'ant-steps')]/div[1][contains(@class,'finish')]/following-sibling::div[1][contains(@class,'wait')]/following-sibling::div[1][contains(@class,'wait')]/following-sibling::div[1][contains(@class,'wait')]/following-sibling::div[1][contains(@class,'active')]"));


}
