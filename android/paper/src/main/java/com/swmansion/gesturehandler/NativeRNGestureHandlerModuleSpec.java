
/**
 * This code was generated by [react-native-codegen](https://www.npmjs.com/package/react-native-codegen).
 *
 * Do not edit this file as changes may cause incorrect behavior and will be lost
 * once the code is regenerated.
 *
 * @generated by codegen project: GenerateModuleJavaSpec.js
 *
 * @nolint
 */

package com.swmansion.gesturehandler;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

public abstract class NativeRNGestureHandlerModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
  public static final String NAME = "RNGestureHandlerModule";

  public NativeRNGestureHandlerModuleSpec(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public @Nonnull String getName() {
    return NAME;
  }

  @ReactMethod
  @DoNotStrip
  public abstract void handleSetJSResponder(double tag, boolean blockNativeResponder);

  @ReactMethod
  @DoNotStrip
  public abstract void handleClearJSResponder();

  @ReactMethod
  @DoNotStrip
  public abstract void createGestureHandler(String handlerName, double handlerTag, ReadableMap config);

  @ReactMethod
  @DoNotStrip
  public abstract void attachGestureHandler(double handlerTag, double newView, double actionType);

  @ReactMethod
  @DoNotStrip
  public abstract void updateGestureHandler(double handlerTag, ReadableMap newConfig);

  @ReactMethod
  @DoNotStrip
  public abstract void dropGestureHandler(double handlerTag);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract boolean install();

  @ReactMethod
  @DoNotStrip
  public abstract void flushOperations();
}
