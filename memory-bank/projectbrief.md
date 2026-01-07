# Fallout Gunpack - Project Brief

## Project Overview
**Type:** Minecraft 1.21.1 NeoForge Mod - TaCZ Addon  
**Status:** ✅ Production Ready  
**Version:** 0.1.1  
**Purpose:** Unofficial NeoForge port of LesRaisins Studio's Fallout-themed gunpack for TaCZ (Timeless and Classics Zero)

## Project Goals
1. Port the original Fabric/Forge Fallout Gunpack to NeoForge 1.21.1
2. Maintain compatibility with TaCZ 1.1.6+
3. Add missing crafting recipes for ammo and attachments
4. Ensure all assets and data files are properly aligned
5. Provide a complete, working Fallout 4-themed weapons addon

## Core Requirements
- **Minecraft Version:** 1.21.1
- **Mod Loader:** NeoForge
- **Dependency:** TaCZ 1.1.6+
- **Namespace:** `tacz_fallout`
- **Distribution:** Standalone JAR in mods folder (not in tacz gunpack path)

## Content Summary
- **8 Weapons** (10mm Pistol, Assault Rifle, Laser Pistol/Rifle, Gauss Rifle, X26 Taser, DZJ-08, QLZ87)
- **3 Custom Ammo Types** (10mm, Fusion Cell, 2mm EC)
- **1 Attachment** (DZJ-08 Scope)
- **Full crafting system** via Gun Smith Table
- **Bilingual support** (English and Chinese)

## Memory Bank Index

### Core Documentation
- [`changelog.md`](./changelog.md) - Project change history

### Context Folders
1. [`productContext/`](./productContext/) - Product vision and user experience
   - `initial.md` - Core product information and goals

2. [`systemPatterns/`](./systemPatterns/) - Architecture and technical patterns
   - `initial.md` - TaCZ addon structure and file relationships

3. [`techContext/`](./techContext/) - Technologies and setup
   - `initial.md` - NeoForge, TaCZ, and development environment

4. [`activeContext/`](./activeContext/) - Current work and decisions
   - `initial.md` - Recent changes and next steps
   - `recipe-implementation_2025-01-07_14-30.md` - Recipe system completion
   - `build-and-testing_2025-01-07_15-00.md` - Successful build and testing prep
   - `testing-complete_2025-01-07_15-30.md` - v0.1.1 testing complete, production ready

5. [`progress/`](./progress/) - Implementation status
   - `initial.md` - What works, what's left, known issues

## Key Contacts
- **Original Author:** LesRaisins Studio
- **Port Author:** Britakee
- **Bug Reports:** Project issues tab (not to original devs)

## Important Notes
- This is an **unofficial port** with explicit permission from original TaCZ dev
- Uses unified packaging process with lowcodefml (not direct JAR extraction)
- Some weapons use base TaCZ ammo types (intentional design)
