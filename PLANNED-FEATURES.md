# GoreeCloud Camera — Planned Features and Open Obligations

**Record type:** Repository planned/open feature inventory  
**Repository:** `GoreeCloud/camera`  
**Lifecycle:** Concept / Development; non-Stable  
**Tracking:** GitHub issue #15  
**Governing standard:** Standard — Repository Feature Tracking and Changelog Governance v1.0

This file contains planned, partial, blocked, or acceptance-gated Camera obligations. Partial source foundations remain open until their defined scope and required acceptance evidence are complete.

## Immediate stabilization priorities

### Current candidate integration and governance

- Integrate only source-complete, current-authority-derived tranches from the active PR #12 → #13 → #14 → #18 stack after exact-head validation, independent review, protection-aware promotion, merged-source readback, and post-merge validation.
- Resolve repository protection/review governance before treating a green Draft PR as integration authority.
- Resolve the open-source license selection through owner/governed authority.
- Establish protected Development signing, monotonic versioning where required, update-in-place verification, production signing provenance, distribution, rollback, and recovery controls.

### Representative camera qualification

Complete supported physical-device/OEM validation for:

- preview, JPEG photo, video, and microphone audio capture;
- camera and microphone permission denial/regrant;
- front/back/external camera selection and advertised device capabilities;
- captured audio presence/quality, audio-video synchronization, and microphone routing;
- activity/background/foreground transitions, camera-service loss, interruption, process death, reboot, and restart reconciliation;
- pending MediaStore photo/video recovery and orphan cleanup;
- partial/low/full storage, large files, provider failures, and publish/finalization errors;
- wall-clock/time-zone changes where they affect filenames or presentation;
- thermal throttling, sustained recording, battery/power behavior, and performance.

### Accessibility and presentation acceptance

- Complete Camera-local Glaze UI V1.6 / 1.6.0 implementation and application acceptance instead of treating a manifest target as conformance.
- Validate TalkBack, Switch Access, Voice Access where claimed, hardware keyboard/focus, large text/reflow, RTL/localization, contrast, Reduced Motion, Reduced Transparency, one-handed use, orientation, tablets, foldables, and other supported form factors.
- Complete Human Visual Excellence and representative-device rendering review.

### Integral Platform Systems

Evaluate and implement all applicable nine Integral Platform Systems with evidence-backed dispositions:

- GoreeCloud Manager
- Privacy Shield
- Wardveil Security
- Everkeep
- Glaze UI
- GoreeCloud Mesh
- GoreeCloud Identity
- GoreeCloud Policy
- GoreeCloud Observability

GoreeCloud Sync remains separately governed. Core camera capture must not acquire network/account authority merely to satisfy a platform checklist.

## Phase 1 — native capture foundation completion

**State:** Partial / in progress.

Implemented foundations are recorded in `IMPLEMENTED-FEATURES.md`. Remaining work:

- complete governed integration of corrected video/audio runtime source;
- representative physical-device preview/photo/video/audio support;
- local settings foundation defined by accepted Camera requirements rather than arbitrary controls;
- stronger interrupted/process-death/reboot photo and recording recovery;
- storage reserve/remaining-time handling appropriate to recording;
- public-repository license resolution.

## Phase 2 — capture reliability and device qualification

**State:** Planned.

- Atomic/recoverable still and recording finalization beyond handled in-process cleanup.
- Recoverable/journaled recording design and startup reconciliation.
- Storage reserve and remaining-time logic.
- Battery-critical finalization and low-power behavior.
- Thermal degradation policy.
- Camera-service/lifecycle recovery.
- Device capability profiles and governed known-quirk overrides.
- Qualification evidence tied to exact app/device/OS revisions.

## Phase 3 — high-quality automatic photography

**State:** Planned.

- Exposure and white-balance optimization.
- Dynamic-range enhancement.
- Local multi-frame processing.
- Low-light optimization.
- Face-aware exposure and natural skin-tone handling.
- Lens/distortion correction.
- Processing-quality profiles with truthful capability fallback.

## Phase 4 — advanced photography and filmmaking

**State:** Planned.

- Night mode.
- Portrait.
- Motion Photos.
- Burst and Best Shot.
- Pro Photo.
- RAW capture where supported.
- Pro Video and Cinema.
- Professional monitoring.
- Stabilization and Horizon Lock.
- Qualified external microphone and storage workflows.

## Phase 5 — multi-camera and creator workflows

**State:** Planned.

- Dual Camera.
- Separate-stream and combined recording.
- Concurrent-camera support when authoritative device capability allows it.
- Director Mode and Multi-Capture.
- Teleprompter.
- Multi-clip creator tools.
- Slow motion, timelapse, hyperlapse, panorama, macro, and product photography.

## Phase 6 — creative platform and GoreeCloud Lenses

**State:** Planned.

- Creative Mode.
- Filters/styles.
- Signed and sandboxed GoreeCloud Lens packages.
- Permission/resource controls.
- Local effects.
- Future Lens Studio authoring direction.

## Phase 7 — scanning and visual utilities

**State:** Planned.

- Document scanning and multi-page capture.
- OCR/searchable documents.
- QR/barcode recognition.
- Text, object, color, and measurement assistance.
- Privacy-aware accessibility descriptions.

## Phase 8 — Private Camera, metadata, and provenance

**State:** Planned.

- Private Capture with accepted protected-storage/authentication mechanisms.
- Metadata policy and user controls.
- Sharing-time privacy controls.
- Capture/provenance relationships.
- Future content-authenticity support where governed.

## Phase 9 — GoreeCloud ecosystem integration

**State:** Partial / blocked on accepted product-local integrations.

- Complete Platform Contract 0.4 evaluation against exactly nine Integral Platform Systems.
- Implement accepted Privacy Shield and Wardveil boundaries for capture, media, external content, and protected/private workflows.
- Define Everkeep protection/recovery scope without conflating backup and sync.
- Integrate Manager, Mesh, Identity, Policy, and Observability only where architecturally applicable.
- Keep ordinary local capture usable when optional connected systems are unavailable.

## Phase 10 — remote and adaptive hardware experiences

**State:** Planned.

- Remote Viewfinder with explicit pairing/session authority.
- Foldable/large-screen layouts.
- Outer-screen preview and rear-camera selfie workflows where supported.
- Tabletop/flex posture.
- Secondary displays.

## Phase 11 — release qualification

**State:** Planned.

Before lifecycle promotion, complete:

- representative-device matrix and OEM qualification;
- recovery/security/privacy/accessibility acceptance;
- current Glaze UI application conformance;
- applicable platform-system evidence;
- controlled build/package provenance;
- protected signing and update continuity;
- documentation reconciliation;
- rollback/recovery;
- Release Candidate and production acceptance; and
- the applicable Seal, Stable, and Anchor gates.

## Explicit non-claims

Until the corresponding evidence exists, this repository does not claim:

- production-safe physical-device camera support across the intended matrix;
- complete video/audio device qualification;
- robust crash/process-death capture recovery;
- full professional/creative/private Camera capability;
- complete Integral Platform System conformance;
- production signing/distribution;
- Release Candidate, production, Stable, Seal, or Anchor status.

## Migration disposition

This file replaces all open/future scope from the retired root `FEATURE-ROADMAP.md`. Implemented portions of that legacy roadmap were moved to `IMPLEMENTED-FEATURES.md`; historical implementation/verification milestones were preserved in `CHANGELOGS.md`. Git history remains the recovery source for the retired roadmap.
