# Fallout Gunpack - Changelog

## 2025-01-07_15-30: Version 0.1.1 Released - All Tests Passed ✅
**Status:** Testing completed successfully, mod is production ready

### Test Results
- ✅ All 8 weapons load correctly
- ✅ All 3 ammo types work properly
- ✅ 10mm ammo recipe fixed (gunpowder tag issue resolved)
- ✅ DZJ-08 Scope now visible in creative menu
- ✅ All recipes craftable at Gun Smith Table
- ✅ All sounds and textures loading correctly
- ✅ No console errors or missing resources
- ✅ Language translations working (EN/CN)

### Version 0.1.1 Changes
- Fixed 10mm ammo recipe using invalid `c:gunpowder` tag → now uses `minecraft:gunpowder`
- Fixed DZJ-08 Scope visibility (changed `"hidden": false`)
- Created comprehensive CHANGELOG.md
- Updated version from 0.1.0 to 0.1.1

### Release Artifacts
- **JAR File:** `tacz_fallout-0.1.1.jar`
- **Status:** Production Ready
- **Distribution:** Ready for public release

## 2025-01-07_15-00: Successful Build & Testing Preparation
**Status:** Built mod JAR successfully, ready for in-game testing

### Build Information
- **Command Used:** `cd c:\Users\Chris\Documents\GitHub\fallout-gunpack; ./gradlew build`
- **Build Result:** SUCCESS
- **Output File:** `build/libs/tacz_fallout-0.1.0.jar`
- **Build Duration:** ~9 seconds
- **Gradle Version:** 9.0.0

### Key Learning
- PowerShell requires semicolon `;` not `&&` for command chaining
- Build system working correctly with all new recipes and fixes

### Next Step
- In-game testing to verify all functionality

## 2025-01-07_14-30: Recipe System Implementation & Project Alignment
**Major Update:** Completed comprehensive project review and added missing crafting recipes

### Added
- **Ammo Recipes** (3 files in `data/tacz_fallout/recipe/ammo/`)
  - `10mm.json` - Ballistic ammunition (16 rounds per craft)
  - `2mm_ec.json` - Electromagnetic cartridges (4 rounds per craft, requires diamond)
  - `fusion_cell.json` - Energy ammunition (12 rounds per craft)
- **Attachment Recipes** (1 file in `data/tacz_fallout/recipe/attachment/`)
  - `scope_dzj08.json` - Rocket launcher scope attachment
- **Language Entries** for scope attachment in both `en_us.json` and `zh_cn.json`

### Fixed
- **gauss_rifle_display.json**: Fixed typo `"gauss_rifleput_away"` → `"gauss_rifle_put_away"`
- **gauss_rifle_display.json**: Changed non-existent `gauss_rifle_inspect_empty` to use `gauss_rifle_inspect`
- **dzj08_display.json**: Removed reference to non-existent `dzj08_reload` sound (disposable weapon)

### Verified
- All 8 gun index files properly reference their data files
- All 3 ammo types have correct display files and stack sizes
- All texture files (slot, hud, UV) present for all items
- All geo models and animations exist
- All sound file references are correct
- All recipe IDs properly reference existing items
- Language files complete for all items

### Documentation
- Updated `README.md` with Features section detailing weapons, ammo, attachments, and crafting
- Created memory bank structure with comprehensive project documentation

## Project Initialization
**Date:** ~2024-2025  
**Author:** Britakee (Port), LesRaisins Studio (Original)

### Initial Port
- Ported Fallout Gunpack from Fabric/Forge to NeoForge 1.21.1
- Implemented 8 Fallout-themed weapons
- Added 3 custom ammo types (with base TaCZ ammo for 3 weapons)
- Included bilingual support (EN/CN)
- Added all required assets (models, textures, sounds, animations)
- Implemented 8 gun crafting recipes
