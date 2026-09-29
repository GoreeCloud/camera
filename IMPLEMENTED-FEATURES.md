# GoreeCloud Camera — Implemented Features

**Record type:** Repository implemented-feature inventory  
**Repository:** `GoreeCloud/camera`  
**Lifecycle:** Concept / Development candidate; non-Stable  
**Tracking:** GitHub issue #15  
**Governing standard:** Standard — Repository Feature Tracking and Changelog Governance v1.0

This file records implementation present in the authoritative repository or the active Development candidate. It does not convert emulator evidence into physical-device, production, Release Candidate, Stable, Seal, or Anchor acceptance.

## Native Android capture foundation

Authoritative `main` provides the original GoreeCloud-owned Android Camera foundation:

- Kotlin/Android native application with canonical identity `com.goreecloud.camera`.
- Android 17 / API 37 compile and target baseline with provisional API 29 minimum.
- Camera permission flow and lifecycle-owned viewfinder host.
- Camera2 camera enumeration, capability registry, deterministic default-camera selection, preview session ownership, and bounded JPEG capture.
- JPEG output discovery, one-shot still capture, deterministic UTC `GCAM_*.jpg` naming, pending MediaStore publication under `DCIM/GoreeCloud Camera`, signature validation, publish-after-write, and handled-failure cleanup.
- No Internet, location, broad-storage, all-files, or media-library-read permission.
- Exact-revision source checks, unit tests, Android lint/build validation, representative Android 16 virtual-camera preview/JPEG qualification, and Platform Contract validation.

Historical integration evidence includes PR #4 preview qualification, PR #6 bounded JPEG/MediaStore capture, PR #7 repository reconciliation, and PR #8 bounded video/audio source foundation. Their exact revisions and workflow records remain recoverable in Git history and pull-request history.

## Video and microphone capture source

The current repository line includes:

- bounded MediaRecorder-compatible video-size discovery;
- Camera2 `TEMPLATE_RECORD` sessions with preview and recorder outputs under the existing session authority;
- MP4/H.264 video plus AAC microphone audio;
- deterministic UTC `GCAM_*.mp4` naming;
- pending MediaStore video reservation/publication and handled-failure cleanup;
- explicit starting/recording/stopping states;
- microphone hardware gating;
- just-in-time `RECORD_AUDIO` authorization after deliberate record intent;
- no automatic recording after permission grant; and
- preview restoration and recorder/session cleanup after stop/failure.

The active stacked Development line represented by PRs #12–#18 carries corrected video finalization and Android 16 video/audio runtime qualification in addition to the current-main foundation. This remains candidate evidence until governed parent-stack integration and readback complete.

## Current Platform Contract and system-bar candidate

The active Development stack includes:

- migration toward Platform Contract 0.4;
- evaluation against all nine Integral Platform Systems;
- Glaze UI V1.6 / 1.6.0 as the target rather than a false conformance claim; and
- Android system-bar safe-area handling.

The repository remains nonconformant until applicable Camera-local integrations and acceptance evidence exist.

## First-use guidance

Draft PR #18 adds the mandatory Camera first-use guidance foundation:

- three-step startup guidance before ordinary preview use;
- persisted interrupted-step resume;
- separate voluntary replay through **Help & guidance**;
- global contextual-hints preference;
- capability/permission text that does not grant Camera or microphone authority; and
- Android 16 automated coverage for first use, recreation/resume, completion, replay, replay cancellation, Settings/help entry, hint preferences, and principal navigation.

Exact candidate `4a44bb8ca26e442c209c302576e6285718633295` passed Android Foundation #55 / run `36502296248`. This closes the source/emulator onboarding defect only; representative-device, accessibility, localization, form-factor, and upgrade acceptance remain open.

## Privacy and storage boundary

Implemented source currently preserves these boundaries:

- core capture is local-first and account-independent;
- media is published through Android MediaStore instead of broad filesystem authority;
- microphone access is requested only for deliberate audio recording;
- no network permission is required for core capture;
- no mandatory telemetry, remote AI, cloud account, or external provider is required for ordinary photo/video capture;
- pending capture rows are removed on handled in-process failure paths.

## Material limitations

The current implementation is an engineering/Development capture foundation, not a production Camera release. Physical-device/OEM qualification, robust interrupted/process-death recovery, storage/thermal/power safeguards, full local settings, advanced photography/filmmaking, private/protected capture, production Glaze UI acceptance, applicable platform-system integration, protected signing, release qualification, production, Seal, Stable, and Anchor status remain open in `PLANNED-FEATURES.md`.
