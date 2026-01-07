# Changelog
All notable changes to the Fallout Gunpack NeoForge port will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [0.1.1] - 2025-01-07

### Fixed
- Fixed 10mm ammo recipe using invalid gunpowder tag - now uses direct `minecraft:gunpowder` item reference
- Fixed DZJ-08 Scope not appearing in creative menu - changed `"hidden": false` in attachment index
- Fixed typo in `gauss_rifle_display.json` sound reference (`gauss_rifleput_away` → `gauss_rifle_put_away`)
- Fixed non-existent sound reference for Gauss Rifle inspect_empty (now uses standard inspect sound)
- Removed invalid reload sound reference from DZJ-08 display file (disposable weapon doesn't need reload sound)

### Added
- **Ammo Crafting Recipes** (Gun Smith Table):
  - 10mm Bullets: Crafts 16 rounds using iron ingots (2), gunpowder (3), iron nuggets (5)
  - Fusion Cells: Crafts 12 rounds using iron ingots (2), redstone dust (6), glowstone dust (3), glass blocks (2)
  - 2mm EC: Crafts 4 rounds using iron ingots (3), redstone dust (8), glowstone dust (4), diamond (1)
- **Attachment Crafting Recipe** (Gun Smith Table):
  - DZJ-08 Scope: Crafts 1 scope using iron ingots (6), glass blocks (4), redstone dust (2), iron nuggets (8)
- Complete language translations for scope attachment (English and Chinese)

### Changed
- Enhanced README.md with detailed Features section documenting all weapons, ammo types, and crafting system

## [0.1.0] - 2024-2025

### Added
- Initial NeoForge 1.21.1 port of LesRaisins Studio's Fallout Gunpack
- **8 Fallout-themed Weapons**:
  - 10mm Pistol - Classic wasteland sidearm
  - Assault Rifle - Commonwealth favorite (uses TaCZ 5.56x45 ammo)
  - Laser Pistol - AER9 energy weapon
  - Laser Rifle - AER9 rifle variant
  - Gauss Rifle - Electromagnetic powerhouse
  - X26 Taser - Pre-war self-defense weapon
  - DZJ-08 Rocket Launcher - Disposable anti-armor weapon (uses TaCZ RPG rockets)
  - QLZ87 Chinese Grenade Launcher - Pre-war ordinance (uses TaCZ 40mm grenades)
- **3 Custom Ammo Types**:
  - 10mm Bullets (stack size: 60)
  - Fusion Cells (stack size: 60)
  - 2mm EC (stack size: 15)
- **1 Attachment**:
  - DZJ-08 Scope (built-in scope for rocket launcher)
- Complete gun crafting recipes (8 recipes)
- Full asset implementation:
  - 3D models and geometry for all weapons
  - UV textures for all items
  - Slot and HUD icons
  - 57 sound files (fire, reload, inspect, draw, put away sounds)
  - 7 animation files (GLTF format)
- Bilingual support (English and Chinese)
- Complete weapon data files with balanced stats:
  - Damage values
  - Recoil patterns
  - Fire modes (auto/semi)
  - Reload times
  - Ammo capacities
  - Attachment slots

### Technical
- Built with Gradle 9.0.0
- Compatible with TaCZ 1.1.6+
- Uses NeoForge convention tags (c:) for cross-mod compatibility
- Follows TaCZ addon structure for proper integration
- Standalone JAR packaging (not datapack extraction)

---

## Version History Summary

- **0.1.1** - Bug fixes and recipe additions
- **0.1.0** - Initial NeoForge port release

---

### Notes
- Some weapons intentionally use base TaCZ ammunition (Assault Rifle, DZJ-08, QLZ87) as they are real-world weapons, not Fallout-specific designs
- This is an **unofficial port** with explicit permission from the original TaCZ developer
- Report bugs in this repository's Issues tab, NOT to the original developers
