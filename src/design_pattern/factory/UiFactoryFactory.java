package design_pattern.factory;

public class UiFactoryFactory {

    public static UIFactory getUIFactoryForPlatform(SupportedPlatform platform){
        if(platform.equals(SupportedPlatform.ANDROID)){
            return new AndroidUIFactory();
        }else if(platform.equals(SupportedPlatform.IOS)){
            return new IOSUIFactory();
        }else if(platform.equals(SupportedPlatform.WINDOWS)){
            return new WindowsFactory();
        }
        return null;
    }
}
