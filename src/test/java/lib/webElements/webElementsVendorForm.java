package lib.webElements;

import com.codeborne.selenide.SelenideElement;
import org.apache.commons.compress.compressors.zstandard.ZstdUtils;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class webElementsVendorForm {
    //Анкета поставщика
    public static SelenideElement orgName = $("#orgName");
    public static SelenideElement buttonSendVendorForm = $(By.xpath("//button[contains(.,'Отправить заявку')]"));
    public static SelenideElement orgCategorySelect = $(By.xpath("//input[@id='orgCategory']/parent::span/parent::div"));
    public static SelenideElement orgCategory = $("#orgCategory");
    public static SelenideElement orgCategoryHelp = $("#orgCategory_help");
    public static SelenideElement goodsCategorySelect = $(By.xpath("//input[@id='goodsCategory']/parent::div/parent::div"));
    public static SelenideElement goodsCategory = $("#goodsCategory");
    public static SelenideElement goodsCategoryHelp = $("#goodsCategory_help");
    public static SelenideElement goodsExtraCategory = $("#goodsExtraCategory");
    public static SelenideElement brands = $("#brands");
    public static SelenideElement brandsHelp = $("#brands_help");
    public static SelenideElement orgSite = $("#orgSite");
    public  static SelenideElement orgSiteHelp = $("#orgSite_help");
    public static SelenideElement orgCatalogLink = $("#orgCatalogLink");
    public static SelenideElement orgCatalogLinkHelp = $("#orgCatalogLink_help");
    public static SelenideElement juroAddress = $("#deJuroAddress");
    public static SelenideElement juroAddressHelp = $("#deJuroAddress_help");
    public static SelenideElement factoAddress = $("#deFactoAddress");
    public static SelenideElement warehousesMainField = $("#warehouses_0");
    public static SelenideElement wareHousesMainFieldHelp = $("#warehouses_0_help");
    public static SelenideElement addingWareHouses = $(By.xpath("//button[contains(.,'Добавить склад')]"));
    public static SelenideElement deletingWareHouses = $(By.xpath("//input[@id='warehouses_1']/parent::div/parent::div/parent::div/parent::div/parent::div/following-sibling::button"));
    public static SelenideElement signTheContractNO = $("[value='Хочу внести изменения в условия договора']");
    public static SelenideElement signTheContractYES = $("[value='Готов подписать договор на указанных в нём условиях']");
    public static SelenideElement signTheContractHelp = $("#signTheContract_help");
    public static SelenideElement uploadFilesHelp = $("#files_help");
    public static SelenideElement sumOfSupplies = $("#sum");
    public static SelenideElement sumOfSuppliesHelp = $("#sum_help");
    public static SelenideElement successResultTitle = $(".ant-result-title");
    public static SelenideElement successResultSubtitle =$(".ant-result-subtitle");
    public static SelenideElement fileUploadVendorForm = $("#files");
    public static SelenideElement fileUploadVendorFormHelp = $("#files_help");

}
