# GoreeCloud Camera — Changelogs

## 2026-09-27 — Project specification and project-record migration

- Added repository-native `PROJECT-SPECIFICATIONS.md` and `PROJECT-RECORD.md` as the canonical project-governance records.
- Reconciled the historical `GoreeCloud/goreecloud-camera` name to the live `GoreeCloud/camera` repository.
- Preserved current accepted `main` state while recording PRs #12–#14 as unmerged candidate history.
- Retired root `SPECIFICATIONS.md` rather than retaining a competing canonical specification.
- Updated repository references to `PLANNED-FEATURES.md` after the accepted Drive feature-roadmap migration.
- Kept Drive project-specification sources protected until review, merge, default-branch readback, and final reconciliation verification complete.

## 2026-09-27 — Drive feature-roadmap migration

- Migrated feature-state authority from the legacy repository/Drive roadmap model to `IMPLEMENTED-FEATURES.md`, `PLANNED-FEATURES.md`, and this `CHANGELOGS.md`.
- Preserved the fuller Drive migration source under `docs/history/drive-feature-roadmap-source-2026-09-16.md` as non-authoritative historical evidence.
- This migration does not imply lifecycle promotion, release acceptance, or production readiness.
