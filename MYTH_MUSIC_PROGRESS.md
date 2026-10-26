# MYTH Music — Crystal Glass Edition

## Phase 1 changes
- Application display name: MYTH Music (debug: MYTH Music Debug).
- Application ID default: `com.mythmusic.app` (existing Kotlin namespace retained to avoid breaking imports, Room, DI and persistence references).
- Crystal Glass light palette installed as default theme colors.
- Reusable `CrystalGlass` Compose container added for later screen-by-screen redesign.
- Existing features/modules preserved; no player or database code removed.

## Still required
- Replace old in-app brand strings, launcher assets, and splash visuals once logo is supplied.
- Integrate CrystalGlass into Home, Search, Library, Player, Mini Player, Settings, and navigation screens.
- Test API-dependent blur/fallback and contrast/accessibility.
- Build and run on Android; no APK has been built or tested here.
- Review GPL-3.0 and NOTICE obligations before distribution.

## Build
Open project in Android Studio with the required Android SDK (compileSdk 37) and run `./gradlew :app:assembleDebug`.
