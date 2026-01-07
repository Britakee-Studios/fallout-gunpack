# System Patterns - TaCZ Addon Architecture

## TaCZ Addon Structure
Fallout Gunpack follows TaCZ's addon pattern for registering custom weapons, ammo, and attachments.

### Directory Layout
```
src/main/resources/
├── assets/tacz_fallout/          # Client-side resources
│   ├── animations/                # GLTF animation files
│   ├── display/                   # Display configurations
│   │   ├── guns/                  # Gun display (models, sounds, transforms)
│   │   ├── ammo/                  # Ammo display (models, icons)
│   │   └── attachments/           # Attachment display
│   ├── geo_models/                # Geometry models
│   │   ├── gun/                   # Gun models (JSON format)
│   │   └── attachment/            # Attachment models
│   ├── textures/                  # All texture files
│   │   ├── gun/                   # Gun textures (slot, hud, uv)
│   │   ├── ammo/                  # Ammo icons
│   │   └── attachment/            # Attachment textures
│   ├── tacz_sounds/               # Sound files (OGG format)
│   ├── lang/                      # Language files (JSON)
│   └── gunpack_info.json          # Pack metadata
│
├── data/tacz_fallout/             # Data/logic
│   ├── index/                     # Item registration
│   │   ├── guns/                  # Gun index files
│   │   ├── ammo/                  # Ammo index files
│   │   └── attachments/           # Attachment index files
│   ├── data/                      # Item data/stats
│   │   ├── guns/                  # Gun stats (damage, recoil, etc.)
│   │   └── attachments/           # Attachment stats
│   ├── recipe/                    # Crafting recipes
│   │   ├── gun/                   # Gun recipes
│   │   ├── ammo/                  # Ammo recipes
│   │   └── attachment/            # Attachment recipes
│   └── scripts/                   # Lua scripts (optional)
│
└── gunpack.meta.json              # Pack metadata
```

## Key Component Relationships

### Item Registration Flow
```
Index File → Data File → Display File → Assets (Models/Textures/Sounds)
```

#### Example: 10mm Pistol
1. **Index:** `data/tacz_fallout/index/guns/10mm_pistol.json`
   - References: `10mm_pistol_display`, `10mm_pistol_data`
   - Defines: name, tooltip, type

2. **Data:** `data/tacz_fallout/data/guns/10mm_pistol_data.json`
   - Defines: ammo type, damage, recoil, fire modes, reload times

3. **Display:** `assets/tacz_fallout/display/guns/10mm_pistol_display.json`
   - References: geometry, texture, animation, sounds
   - Defines: transforms, HUD icon, slot icon

4. **Assets:**
   - Model: `geo_models/gun/10mm_pistol_geo.json`
   - Texture: `textures/gun/uv/10mm_pistol.png`
   - Animation: `animations/10mm_pistol.gltf`
   - Sounds: `tacz_sounds/item/10mm_pistol_*.ogg`

### Recipe System
All recipes use TaCZ's Gun Smith Table crafting type:
```json
{
  "materials": [ /* Array of ingredient objects */ ],
  "result": {
    "type": "gun|ammo|attachment",
    "id": "tacz_fallout:item_name",
    "count": 1  // Optional, for ammo
  },
  "type": "tacz:gun_smith_table_crafting"
}
```

## Design Patterns

### Ammo Reference Pattern
- Guns reference ammo in data files: `"ammo": "tacz_fallout:10mm"`
- Some weapons use base TaCZ ammo: `"ammo": "tacz:556x45"`
- Ammo defines stack size in index files

### Sound Naming Convention
- Format: `{weapon}_{action}[_3p][_s].ogg`
- Actions: fire, reload, draw, put_away, inspect, bolt
- Suffixes: `_3p` (third person), `_s` (silenced)
- Shared sounds: laser weapons share `laser_reload`, `laser_inspect`, `laser_put_away`

### Display Transform System
- `thirdperson`: How gun appears in player's hand
- `ground`: How gun appears as dropped item
- `fixed`: How gun appears in item frames
- `offhand_show`: Left hand positioning
- `hotbar_show`: Inventory/hotbar positioning (supports 0-3 slots)

### Language Key Format
- Guns: `fallout.gun.{id}.name` / `fallout.gun.{id}.desc`
- Ammo: `fallout.ammo.{id}.name`
- Attachments: `fallout.attachment.{id}.name` / `fallout.attachment.{id}.tooltip`
- Pack: `pack.fallout.fallout.name` / `pack.fallout.fallout.desc`
