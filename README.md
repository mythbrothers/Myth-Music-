# MYTH Music — Crystal Glass

Android music app derived from Blazify / Metrolist / InnerTune. Kotlin and Jetpack Compose.

## Build with GitHub Actions
1. Upload this repository (including `.github/workflows/android-build.yml`) to GitHub.
2. Open **Actions** → **Build MYTH Music APK** → **Run workflow**.
3. Download the debug APK from the workflow **Artifacts**. It is for testing, not a signed production release.

## Local build
Open in Android Studio with Android SDK 37, JDK 17 (or toolchain required by Gradle), and run `./gradlew :app:assembleDebug`.

## Branding
Application ID: `com.mythmusic.app`. Logo source: `app/src/main/assets/myth_music_crystal_logo.png`. Crystal Glass palette and reusable component are under `app/src/main/kotlin/com/blazify/music/ui/theme/`.

## Status
Branding, launcher icons, palette foundation and CI build workflow are configured. **This is not a verified fully redesigned or tested final APK.** Existing UI screens still require complete visual integration and runtime testing. Network services inherited from upstream may require configuration and may change.

## License and attribution
Based on GPL-3.0-licensed Blazify, Metrolist and InnerTune. See `LICENSE`, `NOTICE`, and `UPSTREAM_README.md`. Modifications and redistribution must comply with GPL-3.0.
