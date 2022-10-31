package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PearlyMarketPage {
    public PearlyMarketPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[normalize-space()='Register']")
    public WebElement register;
    @FindBy(xpath = "//span[normalize-space()='Sign In']")
    public WebElement signIn;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement signPass;
    @FindBy(xpath = "//button[@name='login']")
    public WebElement signlog;
    @FindBy(xpath = "//a[contains(text(),'My Account')]")
    public WebElement myaccount;
    @FindBy(xpath = "//a[normalize-space()='Store Manager']")
    public WebElement storemanager;
    @FindBy(xpath = "(//span[normalize-space()='Products'])[1]")
    public WebElement products;
    @FindBy(xpath = "//th[@aria-label='Status']")
    public WebElement status;
    @FindBy(xpath = "//th[@aria-label='Stock']")
    public WebElement stock;
    @FindBy(xpath = "//th[@aria-label='Price: activate to sort column ascending']")
    public WebElement price;
    @FindBy(xpath = "//th[@aria-label='Date: activate to sort column ascending']")
    public WebElement date;
    @FindBy(xpath = "//span[contains(text(),'Add New')]")
    public WebElement addnew;
    @FindBy(xpath = "//p[@class='description wcfm_title wcfm_ele virtual_ele_title checkbox_title simple booking non-variable-subscription non-job_package non-resume_package non-redq_rental non-accommodation-booking non-pw-gift-card']")
    public WebElement virtual;
    @FindBy(xpath = "//p[@class='description wcfm_title wcfm_ele downloadable_ele_title checkbox_title simple appointment non-variable-subscription non-job_package non-resume_package non-redq_rental non-accommodation-booking non-pw-gift-card']")
    public WebElement downloadable;
    @FindBy(xpath = "//input[@id='pro_title']")
    public WebElement productTitle;
    @FindBy(xpath = "//input[@id='regular_price']")
    public WebElement prices;
    @FindBy(xpath = "//input[@id='sale_price']")
    public WebElement salesPrice;
    @FindBy(xpath = "(//input[@id='pro_title'])[1]")
    public WebElement dress;
    @FindBy(xpath = "//img[@id='featured_img_display']")
    public WebElement addfoto;
    @FindBy(xpath = "//button[@id='__wp-uploader-id-1']")
    public WebElement selectfile;
    @FindBy(xpath = "//strong[normalize-space()='Short Description']")
    public WebElement shortDescrip;
    @FindBy(xpath = "//p[@class='description wcfm_title wcfm_full_ele wcfm_wpeditor']//strong[contains(text(),'Description')]")
    public WebElement description;
    @FindBy(xpath = "//iframe[@id='excerpt_ifr']")
    public WebElement iframe;
    @FindBy(xpath = "//iframe[@id='description_ifr']")
    public WebElement iframe2;
    @FindBy(xpath = "//button[normalize-space()='Select']")
    public WebElement addproductSelect;
    @FindBy(xpath = "//ul[@id='product_cats_checklist']")
    public WebElement categories;
    @FindBy(xpath = "//span[normalize-space()='Accessories']")
    public List<WebElement> cotegoriesNames;
    @FindBy(xpath = "(//input[@value='225'])[1]")
    public WebElement bestSellerButton;
    @FindBy(xpath = "//input[@value='293']")
    public WebElement amazonBasic;
    @FindBy(xpath = "//img[@id='gallery_img_gimage_0_display']")
    public WebElement addimage;
    @FindBy(xpath = "(//div[@class='thumbnail'])[1]")
    public WebElement imageSelect;
    //  @FindBy(css = "//button[@class='button media-button button-primary button-large media-button-select']")
    //  public WebElement addToGallery;
    @FindBy(xpath = ("//*[@class='button media-button button-primary button-large media-button-select']"))
    public WebElement addToGallery;
    @FindBy(xpath = "//input[@id='wcfm_products_simple_submit_button']")
    public WebElement submit;
    @FindBy(xpath = "(//*[text()='Short Description'])[1]")
    public WebElement shortDescriptionVisible;
    @FindBy(xpath = "//body[@data-id='excerpt']")
    public WebElement shortDescriptionText;
    @FindBy(xpath = "//body[@data-id='description']")
    public WebElement descriptionText;
    @FindBy(xpath = "(//*[text()='Description'])[1]")
    public WebElement descriptionVisible;
    @FindBy(xpath = "//a[normalize-space()='Become a Vendor']")
    public WebElement vendor;
    @FindBy(xpath = "//input[@id='reg_username']")
    public WebElement regusername;
    @FindBy(xpath = "//input[@id='user_email']")
    public WebElement email;
    @FindBy(xpath = "//input[@id='passoword']")
    public WebElement password;
    @FindBy(xpath = "//input[@id='confirm_pwd']")
    public WebElement confirmPassword;
    //tugba hoca
    @FindBy(xpath = "//*[@class='register inline-type']")
    public WebElement register2;
    @FindBy(xpath = "(//*[@href='https://pearlymarket.com/vendor-register/'])[2]")
    public WebElement becomeVendor;
    @FindBy(xpath = "//*[@id='user_email']")
    public WebElement email2;
    @FindBy(xpath = "//*[@id='passoword']")
    public WebElement password2;
    @FindBy(xpath = "//*[@name='password_strength']")
    public WebElement strongSifre;
    @FindBy(xpath = "//*[@class='wcfm-message wcfm-error']")
    public WebElement girisYapilamadi;
    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signn;
    //sena
    @FindBy(xpath = "(//*[text()='SKU'])[1]")
    public WebElement sku;
    @FindBy(xpath = "//*[@id='manage_stock']")
    public WebElement manageStock;
    @FindBy(xpath = "//*[@id='stock_qty']")
    public WebElement stockQty;
    @FindBy(xpath = "//*[text()='Allow Backorders?']")
    public WebElement allowBackorders;
    @FindBy(xpath = "//*[@id='backorders']")
    public WebElement backordersOptions;
    @FindBy(xpath = "//*[text()='Do not Allow']")
    public WebElement doNotAllow;
    @FindBy(xpath = "//*[text()='Allow, but notify customer']")
    public WebElement allowButNotifyCustomer;
    @FindBy(xpath = "//*[text()='Allow']")
    public WebElement allow;
    @FindBy(xpath = "(//*[text()='Sold Individually'])[1]")
    public WebElement soldIndividually;
}