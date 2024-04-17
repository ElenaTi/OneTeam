package lib.webElements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class webElementsVendorContract {
    public static SelenideElement stepper = $(By.xpath("//div[contains(@class, 'VendorContractForm_steps')]"));
    public static SelenideElement step2 = $(By.xpath("//div[contains(@class, 'VendorContractForm_steps')]/div[2]"));
    public static SelenideElement radiobuttonStep0Help = $("#pathwise_radio_help");
    public static SelenideElement buttonSubmitStep0 = $(By.xpath("//button[contains(.,'Продолжить')]"));
    public static SelenideElement radiobuttonStepONO = $(By.xpath(("//input[@value='Нет']")));
    public static SelenideElement labelRadiobuttonNO = $(By.xpath("//input[@value='Нет']/../../span[2]"));
    public static SelenideElement selectedCheckbox = $(By.xpath("//div[@aria-required='true']"));
    public static SelenideElement subtitleVendorContract = $(By.xpath("//div[@role='alert']/following-sibling::div/span/h2"));
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
    public static SelenideElement rightToSignSelectStep1 = $(By.xpath("//input[@id='generateContract_agreement_rightToSign']/parent::span/parent::div"));
    public static SelenideElement rightToSignListStep1 = $("#generateContract_agreement_rightToSign");
    public static SelenideElement step1RightToSignHelp= $("#generateContract_agreement_rightToSign_help");
    public static SelenideElement rightToSignNumberStep1= $("#generateContract_agreement_number");
    public static SelenideElement step1RightToSignNumberHelp= $("#generateContract_agreement_number_help");
    public static SelenideElement bikStep1= $("#generateContract_bankDetails_bik");
    public static SelenideElement step1BIKHelp= $("#generateContract_bankDetails_bik_help");
    public static SelenideElement nameBankStep1= $("#generateContract_bankDetails_nameBank");
    public static SelenideElement step1NameBankHelp= $("#generateContract_bankDetails_nameBank_help");
    public static SelenideElement correspondentAccountStep1= $("#generateContract_bankDetails_correspondentAccount");
    public static SelenideElement step1CorrespondentAccountHelp= $("#generateContract_bankDetails_correspondentAccount_help");
    public static SelenideElement currentAccountStep1= $("#generateContract_bankDetails_currentAccount");
    public static SelenideElement step1CurrentAccountHelp= $("#generateContract_bankDetails_currentAccount_help");

}
